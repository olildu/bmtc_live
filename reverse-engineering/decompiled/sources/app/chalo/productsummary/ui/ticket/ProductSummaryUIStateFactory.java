package app.chalo.productsummary.ui.ticket;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.extensions.AnyExtsKt;
import app.chalo.extensions.StringExtsKt;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusSpec;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusUiState;
import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.metro.data.app.MetroTicketStatus;
import app.chalo.metro.data.app.MetroTicketStopDetails;
import app.chalo.productsummary.ui.data.BookingDetailsUIState;
import app.chalo.productsummary.ui.data.PriceDetailsUIState;
import app.chalo.productsummary.ui.data.ProductSummaryStatusUiData;
import app.chalo.productsummary.ui.data.RouteDetailInfoUIState;
import app.chalo.productsummary.ui.data.ToolBarWithRightComponentUIState;
import app.chalo.productsummary.ui.data.UserInfoUIState;
import app.chalo.productsummary.ui.domain.GetProductStatusUIForSummaryScreen;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.receipt.ProductReceiptDataKt;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.SpecialFeaturesTagListUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.wallet.WalletConstants;
import defpackage.fr0;
import defpackage.tx0;
import defpackage.wl1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/ProductSummaryUIStateFactory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductSummaryUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetProductStatusUIForSummaryScreen f8788a;
    public final StringProvider b;
    public final TimeUtilsContract c;
    public final CurrencyFeature d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8789a;

        static {
            int[] iArr = new int[MetroTicketStatus.values().length];
            try {
                iArr[MetroTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetroTicketStatus.PUNCHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MetroTicketStatus.USED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MetroTicketStatus.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MetroTicketStatus.PAYMENT_PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MetroTicketStatus.PAYMENT_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MetroTicketStatus.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MetroTicketStatus.TAPPED_IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MetroTicketStatus.CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f8789a = iArr;
        }
    }

    public ProductSummaryUIStateFactory(GetProductStatusUIForSummaryScreen getProductStatusUIForSummaryScreen, StringProvider stringProvider, TimeUtilsContract timeUtilsContract, CurrencyFeature currencyFeature) {
        this.f8788a = getProductStatusUIForSummaryScreen;
        this.b = stringProvider;
        this.c = timeUtilsContract;
        this.d = currencyFeature;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x056f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0574  */
    /* JADX WARN: Code duplicated, block: B:103:0x0577  */
    /* JADX WARN: Code duplicated, block: B:104:0x057c  */
    /* JADX WARN: Code duplicated, block: B:106:0x057f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0584  */
    /* JADX WARN: Code duplicated, block: B:109:0x0587  */
    /* JADX WARN: Code duplicated, block: B:121:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:123:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:124:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:126:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:127:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:129:0x05f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:132:0x0608  */
    /* JADX WARN: Code duplicated, block: B:133:0x0613  */
    /* JADX WARN: Code duplicated, block: B:135:0x062a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0635  */
    /* JADX WARN: Code duplicated, block: B:139:0x0656  */
    /* JADX WARN: Code duplicated, block: B:142:0x0661  */
    /* JADX WARN: Code duplicated, block: B:143:0x0683  */
    /* JADX WARN: Code duplicated, block: B:146:0x068e  */
    /* JADX WARN: Code duplicated, block: B:147:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:149:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:151:0x06e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:163:0x0708  */
    /* JADX WARN: Code duplicated, block: B:165:0x070c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0718  */
    /* JADX WARN: Code duplicated, block: B:169:0x071c  */
    /* JADX WARN: Code duplicated, block: B:172:0x073e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0775  */
    /* JADX WARN: Code duplicated, block: B:180:0x077f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0789  */
    /* JADX WARN: Code duplicated, block: B:184:0x0793  */
    /* JADX WARN: Code duplicated, block: B:186:0x079d  */
    /* JADX WARN: Code duplicated, block: B:188:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:193:0x041f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x023a  */
    /* JADX WARN: Code duplicated, block: B:37:0x023f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0246  */
    /* JADX WARN: Code duplicated, block: B:43:0x0272  */
    /* JADX WARN: Code duplicated, block: B:46:0x029f  */
    /* JADX WARN: Code duplicated, block: B:49:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0300  */
    /* JADX WARN: Code duplicated, block: B:57:0x0307  */
    /* JADX WARN: Code duplicated, block: B:60:0x0337  */
    /* JADX WARN: Code duplicated, block: B:63:0x0364  */
    /* JADX WARN: Code duplicated, block: B:66:0x038b  */
    /* JADX WARN: Code duplicated, block: B:68:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x0400  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x041a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0472  */
    /* JADX WARN: Code duplicated, block: B:85:0x0478  */
    /* JADX WARN: Code duplicated, block: B:87:0x0480  */
    /* JADX WARN: Code duplicated, block: B:90:0x04af  */
    /* JADX WARN: Code duplicated, block: B:92:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:98:0x0568  */
    public final Object a(ProductReceiptData productReceiptData, ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking, Map map, String str, Long l, List list, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        ProductSummaryUIStateFactory$createTicketInfoUIState$1 productSummaryUIStateFactory$createTicketInfoUIState$1;
        ChaloUserBookingType.TicketBooking ticketBooking;
        Map map2;
        Long l2;
        List list2;
        boolean z2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        String str2;
        Function1 function2;
        ProductReceiptData productReceiptData2;
        TitleSubtitleUiState titleSubtitleUiState;
        UserDetailsForProducts userDetailsForProducts;
        Object obj;
        String str3;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        String e;
        CoroutineSingletons coroutineSingletons;
        Function1 function3;
        TitleSubtitleUiState titleSubtitleUiState2;
        String str4;
        Map map3;
        UserDetailsForProducts userDetailsForProducts2;
        Long l3;
        TitleSubtitleUiState titleSubtitleUiState3;
        Object objB;
        Function1 function4;
        Map map4;
        List list3;
        Long l4;
        ChaloUserBookingType.TicketBooking ticketBooking2;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        String f;
        UserDetailsForProducts userDetailsForProducts3;
        TitleSubtitleUiState titleSubtitleUiState4;
        ProductReceiptData productReceiptData3;
        ChaloUserBookingType.TicketBooking ticketBooking3;
        List list4;
        TitleSubtitleUiState titleSubtitleUiState5;
        Function1 function5;
        String str5;
        TitleSubtitleUiState titleSubtitleUiState6;
        Object objB2;
        TitleSubtitleUiState titleSubtitleUiState7;
        TitleSubtitleUiState titleSubtitleUiState8;
        String str6;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        TextUIState.ChaloTextUIState chaloTextUIStateG;
        String e2;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState;
        TitleSubtitleUiState titleSubtitleUiState9;
        long jLongValue;
        ChaloUserBookingType.TicketBooking ticketBooking4;
        ProductReceiptData productReceiptData4;
        Object objB3;
        ProductReceiptData productReceiptData5;
        Function1 function6;
        UserDetailsForProducts userDetailsForProducts4;
        List list5;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState2;
        ChaloTextStyleHelper chaloTextStyleHelper6;
        long j;
        TitleSubtitleUiState titleSubtitleUiState10;
        ChaloUserBookingType.TicketBooking ticketBooking5;
        CoroutineSingletons coroutineSingletons2;
        Object objB4;
        ChaloUserBookingType.TicketBooking ticketBooking6;
        List list6;
        String str7;
        TitleSubtitleUiState titleSubtitleUiState11;
        TitleSubtitleUiState titleSubtitleUiState12;
        UserDetailsForProducts userDetailsForProducts5;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState3;
        long j2;
        StringBuilder sb;
        Iterator it;
        boolean z3;
        Map j3;
        TextUIState.ChaloTextUIState chaloTextUIStateG2;
        String f2;
        String str8;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState4;
        String i;
        String g;
        String h;
        RouteDetailInfoUIState routeDetailInfoUIState;
        String e3;
        String c;
        UserInfoUIState userInfoUIState;
        ArrayList arrayList;
        MetroTicketStopDetails metroTicketStopDetails;
        String str9;
        String str10;
        MetroTicketStopDetails metroTicketStopDetails2;
        String str11;
        ImageUrlUIState imageUrlUIState;
        TextUIState.ChaloTextUIState chaloTextUIStateC;
        TextUIState.ChaloTextUIState chaloTextUIStateC2;
        TextUIState.ChaloTextUIState chaloTextUIStateC3;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A;
        if (continuationImpl instanceof ProductSummaryUIStateFactory$createTicketInfoUIState$1) {
            productSummaryUIStateFactory$createTicketInfoUIState$1 = (ProductSummaryUIStateFactory$createTicketInfoUIState$1) continuationImpl;
            int i2 = productSummaryUIStateFactory$createTicketInfoUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productSummaryUIStateFactory$createTicketInfoUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                productSummaryUIStateFactory$createTicketInfoUIState$1 = new ProductSummaryUIStateFactory$createTicketInfoUIState$1(this, continuationImpl);
            }
        } else {
            productSummaryUIStateFactory$createTicketInfoUIState$1 = new ProductSummaryUIStateFactory$createTicketInfoUIState$1(this, continuationImpl);
        }
        Object obj2 = productSummaryUIStateFactory$createTicketInfoUIState$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = productSummaryUIStateFactory$createTicketInfoUIState$1.label;
        TimeUtilsContract timeUtilsContract = this.c;
        StringProvider stringProvider = this.b;
        ChaloTextStyleHelper chaloTextStyleHelper7 = ChaloTextStyleHelper.f10078a;
        if (i3 == 0) {
            ResultKt.b(obj2);
            String strA = (productReceiptData == null || !ProductReceiptDataKt.a(productReceiptData)) ? null : TimeUtilsContract.DefaultImpls.a(timeUtilsContract, productReceiptData.getC(), str, 4);
            if (strA != null) {
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData;
                ticketBooking = metroTicketBooking;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking;
                map2 = map;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = map2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = str;
                l2 = l;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = l2;
                list2 = list;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = list2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = null;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = function1;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = strA;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = chaloTextStyleHelper7;
                z2 = z;
                productSummaryUIStateFactory$createTicketInfoUIState$1.Z$0 = z2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.label = 1;
                Object objB5 = stringProvider.b(StringEnum.VALIDATED_AT, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                if (objB5 == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                str2 = str;
                function2 = function1;
                obj = objB5;
                str3 = strA;
                chaloTextStyleHelper2 = chaloTextStyleHelper7;
                userDetailsForProducts = null;
                productReceiptData2 = productReceiptData;
            } else {
                ticketBooking = metroTicketBooking;
                map2 = map;
                l2 = l;
                list2 = list;
                z2 = z;
                chaloTextStyleHelper = chaloTextStyleHelper7;
                str2 = str;
                function2 = function1;
                productReceiptData2 = productReceiptData;
                titleSubtitleUiState = null;
                userDetailsForProducts = null;
            }
            if (productReceiptData2 != null) {
                e = productReceiptData2.getE();
            } else {
                e = null;
            }
            if (AnyExtsKt.a(e)) {
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = map2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = str2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = l2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = list2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = userDetailsForProducts;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = function2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = chaloTextStyleHelper;
                productSummaryUIStateFactory$createTicketInfoUIState$1.Z$0 = z2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.label = 2;
                objB = stringProvider.b(StringEnum.VEHICLE_NUMBER, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                coroutineSingletons = coroutineSingletons3;
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ChaloUserBookingType.TicketBooking ticketBooking7 = ticketBooking;
                function4 = function2;
                titleSubtitleUiState2 = titleSubtitleUiState;
                obj2 = objB;
                map4 = map2;
                list3 = list2;
                l4 = l2;
                ticketBooking2 = ticketBooking7;
                chaloTextStyleHelper3 = chaloTextStyleHelper;
                TextUIState.ChaloTextUIState chaloTextUIStateC4 = ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) obj2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (productReceiptData2 != null) {
                    chaloTextStyleHelper7 = chaloTextStyleHelper;
                    chaloTextUIStateG = null;
                } else {
                    chaloTextStyleHelper7 = chaloTextStyleHelper;
                    chaloTextUIStateG = null;
                }
                titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC4, chaloTextUIStateG, null, 9);
                List list7 = list3;
                function3 = function4;
                ticketBooking = ticketBooking2;
                userDetailsForProducts2 = userDetailsForProducts;
                l3 = l4;
                list2 = list7;
                str4 = str2;
                map3 = map4;
            } else {
                chaloTextStyleHelper7 = chaloTextStyleHelper;
                timeUtilsContract = timeUtilsContract;
                coroutineSingletons = coroutineSingletons3;
                Map map5 = map2;
                function3 = function2;
                titleSubtitleUiState2 = titleSubtitleUiState;
                str4 = str2;
                map3 = map5;
                Long l5 = l2;
                userDetailsForProducts2 = userDetailsForProducts;
                l3 = l5;
                titleSubtitleUiState3 = null;
            }
            if (productReceiptData2 != null) {
                f = productReceiptData2.getF();
            } else {
                f = null;
            }
            if (AnyExtsKt.a(f)) {
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = map3;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = str4;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = l3;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = list2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = userDetailsForProducts2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = function3;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = titleSubtitleUiState3;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$10 = chaloTextStyleHelper7;
                productSummaryUIStateFactory$createTicketInfoUIState$1.Z$0 = z2;
                productSummaryUIStateFactory$createTicketInfoUIState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.VEHICLE_NUMBER, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                coroutineSingletons = coroutineSingletons;
                if (objB2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                TitleSubtitleUiState titleSubtitleUiState13 = titleSubtitleUiState2;
                titleSubtitleUiState7 = titleSubtitleUiState3;
                titleSubtitleUiState8 = titleSubtitleUiState13;
                str6 = str4;
                obj2 = objB2;
                chaloTextStyleHelper4 = chaloTextStyleHelper7;
                TextUIState.ChaloTextUIState chaloTextUIStateC5 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) obj2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (productReceiptData2 != null) {
                    chaloTextUIStateG2 = null;
                } else {
                    chaloTextUIStateG2 = null;
                }
                titleSubtitleUiState6 = new TitleSubtitleUiState(null, chaloTextUIStateC5, chaloTextUIStateG2, null, 9);
                TitleSubtitleUiState titleSubtitleUiState14 = titleSubtitleUiState8;
                productReceiptData3 = productReceiptData2;
                ticketBooking3 = ticketBooking;
                list4 = list2;
                titleSubtitleUiState5 = titleSubtitleUiState14;
                userDetailsForProducts3 = userDetailsForProducts2;
                titleSubtitleUiState4 = titleSubtitleUiState7;
                function5 = function3;
                str5 = str6;
            } else {
                userDetailsForProducts3 = userDetailsForProducts2;
                titleSubtitleUiState4 = titleSubtitleUiState3;
                productReceiptData3 = productReceiptData2;
                ticketBooking3 = ticketBooking;
                list4 = list2;
                titleSubtitleUiState5 = titleSubtitleUiState2;
                function5 = function3;
                str5 = str4;
                titleSubtitleUiState6 = null;
            }
            if (productReceiptData3 != null) {
                map3 = j3;
            }
            if (map3 != null) {
                ChaloTextStyleHelper chaloTextStyleHelper8 = chaloTextStyleHelper7;
                ImageUIState imageUIState = new ImageUIState(IconType.IC_ICON_TICKET_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                sb = new StringBuilder();
                it = map3.entrySet().iterator();
                z3 = false;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str12 = (String) entry.getKey();
                    Iterator it2 = it;
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    if (z3) {
                        sb.append(",");
                    }
                    sb.append(iIntValue);
                    sb.append(" ");
                    sb.append(StringExtsKt.a(str12));
                    it = it2;
                    z3 = true;
                }
                String string = sb.toString();
                Intrinsics.h(string, "toString(...)");
                chaloTextStyleHelper5 = chaloTextStyleHelper8;
                textWithLeftAndRightIconUIState = new TextWithLeftAndRightIconUIState(imageUIState, ChaloTextStyleHelper.g(chaloTextStyleHelper8, string, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 0.0f, null, 28);
            } else {
                chaloTextStyleHelper5 = chaloTextStyleHelper7;
                textWithLeftAndRightIconUIState = null;
            }
            if (l3 != 0) {
                jLongValue = l3.longValue();
                if (z2) {
                    coroutineSingletons2 = coroutineSingletons;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = str5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = list4;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = userDetailsForProducts3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = function5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = titleSubtitleUiState5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = titleSubtitleUiState4;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState6;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = textWithLeftAndRightIconUIState;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$10 = chaloTextStyleHelper5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.J$0 = jLongValue;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.label = 4;
                    objB4 = stringProvider.b(StringEnum.EXPIRED_AT, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                    if (objB4 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    ticketBooking6 = ticketBooking3;
                    list6 = list4;
                    str7 = str5;
                    titleSubtitleUiState11 = titleSubtitleUiState5;
                    titleSubtitleUiState12 = titleSubtitleUiState6;
                    obj2 = objB4;
                    userDetailsForProducts5 = userDetailsForProducts3;
                    textWithLeftAndRightIconUIState3 = textWithLeftAndRightIconUIState;
                    chaloTextStyleHelper6 = chaloTextStyleHelper5;
                    productReceiptData5 = productReceiptData3;
                    j2 = jLongValue;
                    str8 = (String) obj2;
                    textWithLeftAndRightIconUIState4 = textWithLeftAndRightIconUIState3;
                    userDetailsForProducts3 = userDetailsForProducts5;
                    titleSubtitleUiState5 = titleSubtitleUiState11;
                    TitleSubtitleUiState titleSubtitleUiState15 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper6, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper5, TimeUtilsContract.DefaultImpls.a(timeUtilsContract, j2, str7, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                    productReceiptData3 = productReceiptData5;
                    titleSubtitleUiState6 = titleSubtitleUiState12;
                    textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState4;
                    list4 = list6;
                    titleSubtitleUiState9 = titleSubtitleUiState15;
                    ticketBooking3 = ticketBooking6;
                } else {
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = str5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = list4;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = userDetailsForProducts3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = function5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = titleSubtitleUiState5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = titleSubtitleUiState4;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState6;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = textWithLeftAndRightIconUIState;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$10 = chaloTextStyleHelper5;
                    ticketBooking4 = ticketBooking3;
                    productReceiptData4 = productReceiptData3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.J$0 = jLongValue;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.label = 5;
                    objB3 = stringProvider.b(StringEnum.VALID_TILL, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                    if (objB3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    productReceiptData5 = productReceiptData4;
                    function6 = function5;
                    userDetailsForProducts4 = userDetailsForProducts3;
                    list5 = list4;
                    textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                    chaloTextStyleHelper6 = chaloTextStyleHelper5;
                    j = jLongValue;
                    titleSubtitleUiState10 = titleSubtitleUiState6;
                    obj2 = objB3;
                    ticketBooking5 = ticketBooking4;
                    str8 = (String) obj2;
                    List list8 = list5;
                    ticketBooking6 = ticketBooking5;
                    j2 = j;
                    function5 = function6;
                    list6 = list8;
                    textWithLeftAndRightIconUIState4 = textWithLeftAndRightIconUIState2;
                    titleSubtitleUiState12 = titleSubtitleUiState10;
                    userDetailsForProducts3 = userDetailsForProducts4;
                    str7 = str5;
                    TitleSubtitleUiState titleSubtitleUiState16 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper6, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper5, TimeUtilsContract.DefaultImpls.a(timeUtilsContract, j2, str7, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                    productReceiptData3 = productReceiptData5;
                    titleSubtitleUiState6 = titleSubtitleUiState12;
                    textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState4;
                    list4 = list6;
                    titleSubtitleUiState9 = titleSubtitleUiState16;
                    ticketBooking3 = ticketBooking6;
                }
            } else {
                titleSubtitleUiState9 = null;
            }
            if (productReceiptData3 != null) {
                i = productReceiptData3.getI();
            } else {
                i = null;
            }
            if (productReceiptData3 != null) {
                g = productReceiptData3.getG();
            } else {
                g = null;
            }
            if (productReceiptData3 != null) {
                h = productReceiptData3.getH();
            } else {
                h = null;
            }
            if (i != null) {
                routeDetailInfoUIState = null;
            } else {
                routeDetailInfoUIState = null;
            }
            if (userDetailsForProducts3 != null) {
                e3 = userDetailsForProducts3.getE();
            } else {
                e3 = null;
            }
            if (userDetailsForProducts3 != null) {
                c = userDetailsForProducts3.getC();
            } else {
                c = null;
            }
            if (c != null) {
                if (e3 != null) {
                    ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                    UIContentScale uIContentScale = UIContentScale.Crop;
                    if (function5 != null) {
                        uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new tx0(function5, userDetailsForProducts3, 0));
                    } else {
                        uiEventHandler$Companion$fromLambda$1A = null;
                    }
                    imageUrlUIState = new ImageUrlUIState(e3, imageUISize, uIContentScale, uiEventHandler$Companion$fromLambda$1A, 38);
                } else {
                    imageUrlUIState = null;
                }
                if (AnyExtsKt.a(userDetailsForProducts3.e())) {
                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.e(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                } else {
                    chaloTextUIStateC = null;
                }
                if (AnyExtsKt.a(userDetailsForProducts3.getC())) {
                    chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.getC(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                } else {
                    chaloTextUIStateC2 = null;
                }
                if (AnyExtsKt.a(userDetailsForProducts3.b())) {
                    chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.b(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                } else {
                    chaloTextUIStateC3 = null;
                }
                userInfoUIState = new UserInfoUIState(imageUrlUIState, new ImageUIState(IconType.IC_PROFILE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.FillBounds, 0.0f, (UiEventHandler) null, 230), chaloTextUIStateC2, chaloTextUIStateC, chaloTextUIStateC3);
            } else {
                userInfoUIState = null;
            }
            if (titleSubtitleUiState5 != null) {
            }
            arrayList = new ArrayList();
            if (routeDetailInfoUIState != null) {
                arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(routeDetailInfoUIState));
            } else if (ticketBooking3 instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
                MetroTicketAppModel metroTicketAppModel = ((ChaloUserBookingType.TicketBooking.MetroTicketBooking) ticketBooking3).d;
                metroTicketStopDetails = metroTicketAppModel.n;
                str9 = "";
                if (metroTicketStopDetails != null) {
                    str10 = "";
                } else {
                    str10 = "";
                }
                TextUIState.ChaloTextUIState chaloTextUIStateC6 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, str10, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                metroTicketStopDetails2 = metroTicketAppModel.o;
                if (metroTicketStopDetails2 != null) {
                    str9 = str11;
                }
                arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(new RouteDetailInfoUIState(null, chaloTextUIStateC6, ChaloTextStyleHelper.c(chaloTextStyleHelper5, str9, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new SpecialFeaturesTagListUIState(EmptyList.f17557a))));
            }
            if (titleSubtitleUiState5 != null) {
                arrayList.add(new TicketInfoContentUIState.ValidatedAt(titleSubtitleUiState5));
            }
            if (titleSubtitleUiState9 != null) {
                arrayList.add(new TicketInfoContentUIState.ExpiredAt(titleSubtitleUiState9));
            }
            if (titleSubtitleUiState4 != null) {
                arrayList.add(new TicketInfoContentUIState.VehicleNumber(titleSubtitleUiState4));
            }
            if (textWithLeftAndRightIconUIState != null) {
                arrayList.add(new TicketInfoContentUIState.NumberOfTickets(textWithLeftAndRightIconUIState));
            }
            if (titleSubtitleUiState6 != null) {
                arrayList.add(new TicketInfoContentUIState.ConductorId(titleSubtitleUiState6));
            }
            if (userInfoUIState != null) {
                arrayList.add(new TicketInfoContentUIState.UserInfo(userInfoUIState));
            }
            return new TicketInfoUIState(arrayList, new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, DividerOrientation.Horizontal), 4);
        }
        if (i3 != 1) {
            if (i3 == 2) {
                boolean z4 = productSummaryUIStateFactory$createTicketInfoUIState$1.Z$0;
                ChaloTextStyleHelper chaloTextStyleHelper9 = (ChaloTextStyleHelper) productSummaryUIStateFactory$createTicketInfoUIState$1.L$9;
                titleSubtitleUiState2 = (TitleSubtitleUiState) productSummaryUIStateFactory$createTicketInfoUIState$1.L$8;
                function4 = (Function1) productSummaryUIStateFactory$createTicketInfoUIState$1.L$7;
                userDetailsForProducts = (UserDetailsForProducts) productSummaryUIStateFactory$createTicketInfoUIState$1.L$6;
                list3 = (List) productSummaryUIStateFactory$createTicketInfoUIState$1.L$5;
                l4 = (Long) productSummaryUIStateFactory$createTicketInfoUIState$1.L$4;
                str2 = (String) productSummaryUIStateFactory$createTicketInfoUIState$1.L$3;
                Map map6 = (Map) productSummaryUIStateFactory$createTicketInfoUIState$1.L$2;
                ticketBooking2 = (ChaloUserBookingType.TicketBooking) productSummaryUIStateFactory$createTicketInfoUIState$1.L$1;
                productReceiptData2 = (ProductReceiptData) productSummaryUIStateFactory$createTicketInfoUIState$1.L$0;
                ResultKt.b(obj2);
                chaloTextStyleHelper3 = chaloTextStyleHelper9;
                chaloTextStyleHelper = chaloTextStyleHelper7;
                coroutineSingletons = coroutineSingletons3;
                map4 = map6;
                z2 = z4;
                TextUIState.ChaloTextUIState chaloTextUIStateC7 = ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) obj2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (productReceiptData2 != null || (e2 = productReceiptData2.getE()) == null) {
                    chaloTextStyleHelper7 = chaloTextStyleHelper;
                    chaloTextUIStateG = null;
                } else {
                    ChaloTextStyleHelper chaloTextStyleHelper10 = chaloTextStyleHelper;
                    chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper10, e2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    chaloTextStyleHelper7 = chaloTextStyleHelper10;
                }
                titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC7, chaloTextUIStateG, null, 9);
                List list9 = list3;
                function3 = function4;
                ticketBooking = ticketBooking2;
                userDetailsForProducts2 = userDetailsForProducts;
                l3 = l4;
                list2 = list9;
                str4 = str2;
                map3 = map4;
                if (productReceiptData2 != null) {
                    f = productReceiptData2.getF();
                } else {
                    f = null;
                }
                if (AnyExtsKt.a(f)) {
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData2;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = map3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = str4;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = l3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = list2;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = userDetailsForProducts2;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = function3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState2;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = titleSubtitleUiState3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$10 = chaloTextStyleHelper7;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.Z$0 = z2;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.VEHICLE_NUMBER, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                    coroutineSingletons = coroutineSingletons;
                    if (objB2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    TitleSubtitleUiState titleSubtitleUiState17 = titleSubtitleUiState2;
                    titleSubtitleUiState7 = titleSubtitleUiState3;
                    titleSubtitleUiState8 = titleSubtitleUiState17;
                    str6 = str4;
                    obj2 = objB2;
                    chaloTextStyleHelper4 = chaloTextStyleHelper7;
                    TextUIState.ChaloTextUIState chaloTextUIStateC8 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) obj2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    if (productReceiptData2 != null) {
                        chaloTextUIStateG2 = null;
                    } else {
                        chaloTextUIStateG2 = null;
                    }
                    titleSubtitleUiState6 = new TitleSubtitleUiState(null, chaloTextUIStateC8, chaloTextUIStateG2, null, 9);
                    TitleSubtitleUiState titleSubtitleUiState18 = titleSubtitleUiState8;
                    productReceiptData3 = productReceiptData2;
                    ticketBooking3 = ticketBooking;
                    list4 = list2;
                    titleSubtitleUiState5 = titleSubtitleUiState18;
                    userDetailsForProducts3 = userDetailsForProducts2;
                    titleSubtitleUiState4 = titleSubtitleUiState7;
                    function5 = function3;
                    str5 = str6;
                } else {
                    userDetailsForProducts3 = userDetailsForProducts2;
                    titleSubtitleUiState4 = titleSubtitleUiState3;
                    productReceiptData3 = productReceiptData2;
                    ticketBooking3 = ticketBooking;
                    list4 = list2;
                    titleSubtitleUiState5 = titleSubtitleUiState2;
                    function5 = function3;
                    str5 = str4;
                    titleSubtitleUiState6 = null;
                }
                if (productReceiptData3 != null) {
                    map3 = j3;
                }
                if (map3 != null) {
                    ChaloTextStyleHelper chaloTextStyleHelper11 = chaloTextStyleHelper7;
                    ImageUIState imageUIState2 = new ImageUIState(IconType.IC_ICON_TICKET_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    sb = new StringBuilder();
                    it = map3.entrySet().iterator();
                    z3 = false;
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        String str13 = (String) entry2.getKey();
                        Iterator it3 = it;
                        int iIntValue2 = ((Number) entry2.getValue()).intValue();
                        if (z3) {
                            sb.append(",");
                        }
                        sb.append(iIntValue2);
                        sb.append(" ");
                        sb.append(StringExtsKt.a(str13));
                        it = it3;
                        z3 = true;
                    }
                    String string2 = sb.toString();
                    Intrinsics.h(string2, "toString(...)");
                    chaloTextStyleHelper5 = chaloTextStyleHelper11;
                    textWithLeftAndRightIconUIState = new TextWithLeftAndRightIconUIState(imageUIState2, ChaloTextStyleHelper.g(chaloTextStyleHelper11, string2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 0.0f, null, 28);
                } else {
                    chaloTextStyleHelper5 = chaloTextStyleHelper7;
                    textWithLeftAndRightIconUIState = null;
                }
                if (l3 != 0) {
                    jLongValue = l3.longValue();
                    if (z2) {
                        coroutineSingletons2 = coroutineSingletons;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData3;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking3;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = str5;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = list4;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = userDetailsForProducts3;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = function5;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = titleSubtitleUiState5;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = titleSubtitleUiState4;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState6;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = textWithLeftAndRightIconUIState;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$10 = chaloTextStyleHelper5;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.J$0 = jLongValue;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.label = 4;
                        objB4 = stringProvider.b(StringEnum.EXPIRED_AT, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                        if (objB4 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        ticketBooking6 = ticketBooking3;
                        list6 = list4;
                        str7 = str5;
                        titleSubtitleUiState11 = titleSubtitleUiState5;
                        titleSubtitleUiState12 = titleSubtitleUiState6;
                        obj2 = objB4;
                        userDetailsForProducts5 = userDetailsForProducts3;
                        textWithLeftAndRightIconUIState3 = textWithLeftAndRightIconUIState;
                        chaloTextStyleHelper6 = chaloTextStyleHelper5;
                        productReceiptData5 = productReceiptData3;
                        j2 = jLongValue;
                        str8 = (String) obj2;
                        textWithLeftAndRightIconUIState4 = textWithLeftAndRightIconUIState3;
                        userDetailsForProducts3 = userDetailsForProducts5;
                        titleSubtitleUiState5 = titleSubtitleUiState11;
                        TitleSubtitleUiState titleSubtitleUiState19 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper6, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper5, TimeUtilsContract.DefaultImpls.a(timeUtilsContract, j2, str7, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                        productReceiptData3 = productReceiptData5;
                        titleSubtitleUiState6 = titleSubtitleUiState12;
                        textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState4;
                        list4 = list6;
                        titleSubtitleUiState9 = titleSubtitleUiState19;
                        ticketBooking3 = ticketBooking6;
                    } else {
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData3;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking3;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = str5;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = list4;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = userDetailsForProducts3;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = function5;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = titleSubtitleUiState5;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = titleSubtitleUiState4;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState6;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = textWithLeftAndRightIconUIState;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.L$10 = chaloTextStyleHelper5;
                        ticketBooking4 = ticketBooking3;
                        productReceiptData4 = productReceiptData3;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.J$0 = jLongValue;
                        productSummaryUIStateFactory$createTicketInfoUIState$1.label = 5;
                        objB3 = stringProvider.b(StringEnum.VALID_TILL, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                        if (objB3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        productReceiptData5 = productReceiptData4;
                        function6 = function5;
                        userDetailsForProducts4 = userDetailsForProducts3;
                        list5 = list4;
                        textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                        chaloTextStyleHelper6 = chaloTextStyleHelper5;
                        j = jLongValue;
                        titleSubtitleUiState10 = titleSubtitleUiState6;
                        obj2 = objB3;
                        ticketBooking5 = ticketBooking4;
                        str8 = (String) obj2;
                        List list10 = list5;
                        ticketBooking6 = ticketBooking5;
                        j2 = j;
                        function5 = function6;
                        list6 = list10;
                        textWithLeftAndRightIconUIState4 = textWithLeftAndRightIconUIState2;
                        titleSubtitleUiState12 = titleSubtitleUiState10;
                        userDetailsForProducts3 = userDetailsForProducts4;
                        str7 = str5;
                        TitleSubtitleUiState titleSubtitleUiState110 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper6, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper5, TimeUtilsContract.DefaultImpls.a(timeUtilsContract, j2, str7, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                        productReceiptData3 = productReceiptData5;
                        titleSubtitleUiState6 = titleSubtitleUiState12;
                        textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState4;
                        list4 = list6;
                        titleSubtitleUiState9 = titleSubtitleUiState110;
                        ticketBooking3 = ticketBooking6;
                    }
                } else {
                    titleSubtitleUiState9 = null;
                }
                if (productReceiptData3 != null) {
                    i = productReceiptData3.getI();
                } else {
                    i = null;
                }
                if (productReceiptData3 != null) {
                    g = productReceiptData3.getG();
                } else {
                    g = null;
                }
                if (productReceiptData3 != null) {
                    h = productReceiptData3.getH();
                } else {
                    h = null;
                }
                if (i != null) {
                    routeDetailInfoUIState = null;
                } else {
                    routeDetailInfoUIState = null;
                }
                if (userDetailsForProducts3 != null) {
                    e3 = userDetailsForProducts3.getE();
                } else {
                    e3 = null;
                }
                if (userDetailsForProducts3 != null) {
                    c = userDetailsForProducts3.getC();
                } else {
                    c = null;
                }
                if (c != null) {
                    if (e3 != null) {
                        ImageUISize imageUISize2 = new ImageUISize(ChaloThemeHelper.a().m);
                        UIContentScale uIContentScale2 = UIContentScale.Crop;
                        if (function5 != null) {
                            uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new tx0(function5, userDetailsForProducts3, 0));
                        } else {
                            uiEventHandler$Companion$fromLambda$1A = null;
                        }
                        imageUrlUIState = new ImageUrlUIState(e3, imageUISize2, uIContentScale2, uiEventHandler$Companion$fromLambda$1A, 38);
                    } else {
                        imageUrlUIState = null;
                    }
                    if (AnyExtsKt.a(userDetailsForProducts3.e())) {
                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.e(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    } else {
                        chaloTextUIStateC = null;
                    }
                    if (AnyExtsKt.a(userDetailsForProducts3.getC())) {
                        chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.getC(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    } else {
                        chaloTextUIStateC2 = null;
                    }
                    if (AnyExtsKt.a(userDetailsForProducts3.b())) {
                        chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.b(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    } else {
                        chaloTextUIStateC3 = null;
                    }
                    userInfoUIState = new UserInfoUIState(imageUrlUIState, new ImageUIState(IconType.IC_PROFILE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.FillBounds, 0.0f, (UiEventHandler) null, 230), chaloTextUIStateC2, chaloTextUIStateC, chaloTextUIStateC3);
                } else {
                    userInfoUIState = null;
                }
                if (titleSubtitleUiState5 != null) {
                }
                arrayList = new ArrayList();
                if (routeDetailInfoUIState != null) {
                    arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(routeDetailInfoUIState));
                } else if (ticketBooking3 instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
                    MetroTicketAppModel metroTicketAppModel2 = ((ChaloUserBookingType.TicketBooking.MetroTicketBooking) ticketBooking3).d;
                    metroTicketStopDetails = metroTicketAppModel2.n;
                    str9 = "";
                    if (metroTicketStopDetails != null) {
                        str10 = "";
                    } else {
                        str10 = "";
                    }
                    TextUIState.ChaloTextUIState chaloTextUIStateC9 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, str10, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    metroTicketStopDetails2 = metroTicketAppModel2.o;
                    if (metroTicketStopDetails2 != null) {
                        str9 = str11;
                    }
                    arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(new RouteDetailInfoUIState(null, chaloTextUIStateC9, ChaloTextStyleHelper.c(chaloTextStyleHelper5, str9, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new SpecialFeaturesTagListUIState(EmptyList.f17557a))));
                }
                if (titleSubtitleUiState5 != null) {
                    arrayList.add(new TicketInfoContentUIState.ValidatedAt(titleSubtitleUiState5));
                }
                if (titleSubtitleUiState9 != null) {
                    arrayList.add(new TicketInfoContentUIState.ExpiredAt(titleSubtitleUiState9));
                }
                if (titleSubtitleUiState4 != null) {
                    arrayList.add(new TicketInfoContentUIState.VehicleNumber(titleSubtitleUiState4));
                }
                if (textWithLeftAndRightIconUIState != null) {
                    arrayList.add(new TicketInfoContentUIState.NumberOfTickets(textWithLeftAndRightIconUIState));
                }
                if (titleSubtitleUiState6 != null) {
                    arrayList.add(new TicketInfoContentUIState.ConductorId(titleSubtitleUiState6));
                }
                if (userInfoUIState != null) {
                    arrayList.add(new TicketInfoContentUIState.UserInfo(userInfoUIState));
                }
                return new TicketInfoUIState(arrayList, new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, DividerOrientation.Horizontal), 4);
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    j2 = productSummaryUIStateFactory$createTicketInfoUIState$1.J$0;
                    ChaloTextStyleHelper chaloTextStyleHelper12 = (ChaloTextStyleHelper) productSummaryUIStateFactory$createTicketInfoUIState$1.L$10;
                    textWithLeftAndRightIconUIState3 = (TextWithLeftAndRightIconUIState) productSummaryUIStateFactory$createTicketInfoUIState$1.L$9;
                    titleSubtitleUiState12 = (TitleSubtitleUiState) productSummaryUIStateFactory$createTicketInfoUIState$1.L$8;
                    TitleSubtitleUiState titleSubtitleUiState20 = (TitleSubtitleUiState) productSummaryUIStateFactory$createTicketInfoUIState$1.L$7;
                    titleSubtitleUiState11 = (TitleSubtitleUiState) productSummaryUIStateFactory$createTicketInfoUIState$1.L$6;
                    Function1 function7 = (Function1) productSummaryUIStateFactory$createTicketInfoUIState$1.L$5;
                    userDetailsForProducts5 = (UserDetailsForProducts) productSummaryUIStateFactory$createTicketInfoUIState$1.L$4;
                    list6 = (List) productSummaryUIStateFactory$createTicketInfoUIState$1.L$3;
                    str7 = (String) productSummaryUIStateFactory$createTicketInfoUIState$1.L$2;
                    ticketBooking6 = (ChaloUserBookingType.TicketBooking) productSummaryUIStateFactory$createTicketInfoUIState$1.L$1;
                    productReceiptData5 = (ProductReceiptData) productSummaryUIStateFactory$createTicketInfoUIState$1.L$0;
                    ResultKt.b(obj2);
                    chaloTextStyleHelper6 = chaloTextStyleHelper12;
                    function5 = function7;
                    titleSubtitleUiState4 = titleSubtitleUiState20;
                    chaloTextStyleHelper5 = chaloTextStyleHelper7;
                    timeUtilsContract = timeUtilsContract;
                    str8 = (String) obj2;
                    textWithLeftAndRightIconUIState4 = textWithLeftAndRightIconUIState3;
                    userDetailsForProducts3 = userDetailsForProducts5;
                    titleSubtitleUiState5 = titleSubtitleUiState11;
                    TitleSubtitleUiState titleSubtitleUiState111 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper6, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper5, TimeUtilsContract.DefaultImpls.a(timeUtilsContract, j2, str7, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                    productReceiptData3 = productReceiptData5;
                    titleSubtitleUiState6 = titleSubtitleUiState12;
                    textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState4;
                    list4 = list6;
                    titleSubtitleUiState9 = titleSubtitleUiState111;
                    ticketBooking3 = ticketBooking6;
                    if (productReceiptData3 != null) {
                        i = productReceiptData3.getI();
                    } else {
                        i = null;
                    }
                    if (productReceiptData3 != null) {
                        g = productReceiptData3.getG();
                    } else {
                        g = null;
                    }
                    if (productReceiptData3 != null) {
                        h = productReceiptData3.getH();
                    } else {
                        h = null;
                    }
                    if (i != null) {
                        routeDetailInfoUIState = null;
                    } else {
                        routeDetailInfoUIState = null;
                    }
                    if (userDetailsForProducts3 != null) {
                        e3 = userDetailsForProducts3.getE();
                    } else {
                        e3 = null;
                    }
                    if (userDetailsForProducts3 != null) {
                        c = userDetailsForProducts3.getC();
                    } else {
                        c = null;
                    }
                    if (c != null) {
                        if (e3 != null) {
                            ImageUISize imageUISize3 = new ImageUISize(ChaloThemeHelper.a().m);
                            UIContentScale uIContentScale3 = UIContentScale.Crop;
                            if (function5 != null) {
                                uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new tx0(function5, userDetailsForProducts3, 0));
                            } else {
                                uiEventHandler$Companion$fromLambda$1A = null;
                            }
                            imageUrlUIState = new ImageUrlUIState(e3, imageUISize3, uIContentScale3, uiEventHandler$Companion$fromLambda$1A, 38);
                        } else {
                            imageUrlUIState = null;
                        }
                        if (AnyExtsKt.a(userDetailsForProducts3.e())) {
                            chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.e(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        } else {
                            chaloTextUIStateC = null;
                        }
                        if (AnyExtsKt.a(userDetailsForProducts3.getC())) {
                            chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.getC(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        } else {
                            chaloTextUIStateC2 = null;
                        }
                        if (AnyExtsKt.a(userDetailsForProducts3.b())) {
                            chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.b(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        } else {
                            chaloTextUIStateC3 = null;
                        }
                        userInfoUIState = new UserInfoUIState(imageUrlUIState, new ImageUIState(IconType.IC_PROFILE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.FillBounds, 0.0f, (UiEventHandler) null, 230), chaloTextUIStateC2, chaloTextUIStateC, chaloTextUIStateC3);
                    } else {
                        userInfoUIState = null;
                    }
                    if (titleSubtitleUiState5 != null) {
                    }
                    arrayList = new ArrayList();
                    if (routeDetailInfoUIState != null) {
                        arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(routeDetailInfoUIState));
                    } else if (ticketBooking3 instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
                        MetroTicketAppModel metroTicketAppModel3 = ((ChaloUserBookingType.TicketBooking.MetroTicketBooking) ticketBooking3).d;
                        metroTicketStopDetails = metroTicketAppModel3.n;
                        str9 = "";
                        if (metroTicketStopDetails != null) {
                            str10 = "";
                        } else {
                            str10 = "";
                        }
                        TextUIState.ChaloTextUIState chaloTextUIStateC10 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, str10, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        metroTicketStopDetails2 = metroTicketAppModel3.o;
                        if (metroTicketStopDetails2 != null) {
                            str9 = str11;
                        }
                        arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(new RouteDetailInfoUIState(null, chaloTextUIStateC10, ChaloTextStyleHelper.c(chaloTextStyleHelper5, str9, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new SpecialFeaturesTagListUIState(EmptyList.f17557a))));
                    }
                    if (titleSubtitleUiState5 != null) {
                        arrayList.add(new TicketInfoContentUIState.ValidatedAt(titleSubtitleUiState5));
                    }
                    if (titleSubtitleUiState9 != null) {
                        arrayList.add(new TicketInfoContentUIState.ExpiredAt(titleSubtitleUiState9));
                    }
                    if (titleSubtitleUiState4 != null) {
                        arrayList.add(new TicketInfoContentUIState.VehicleNumber(titleSubtitleUiState4));
                    }
                    if (textWithLeftAndRightIconUIState != null) {
                        arrayList.add(new TicketInfoContentUIState.NumberOfTickets(textWithLeftAndRightIconUIState));
                    }
                    if (titleSubtitleUiState6 != null) {
                        arrayList.add(new TicketInfoContentUIState.ConductorId(titleSubtitleUiState6));
                    }
                    if (userInfoUIState != null) {
                        arrayList.add(new TicketInfoContentUIState.UserInfo(userInfoUIState));
                    }
                    return new TicketInfoUIState(arrayList, new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, DividerOrientation.Horizontal), 4);
                }
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = productSummaryUIStateFactory$createTicketInfoUIState$1.J$0;
                ChaloTextStyleHelper chaloTextStyleHelper13 = (ChaloTextStyleHelper) productSummaryUIStateFactory$createTicketInfoUIState$1.L$10;
                textWithLeftAndRightIconUIState2 = (TextWithLeftAndRightIconUIState) productSummaryUIStateFactory$createTicketInfoUIState$1.L$9;
                TitleSubtitleUiState titleSubtitleUiState21 = (TitleSubtitleUiState) productSummaryUIStateFactory$createTicketInfoUIState$1.L$8;
                titleSubtitleUiState4 = (TitleSubtitleUiState) productSummaryUIStateFactory$createTicketInfoUIState$1.L$7;
                titleSubtitleUiState5 = (TitleSubtitleUiState) productSummaryUIStateFactory$createTicketInfoUIState$1.L$6;
                function6 = (Function1) productSummaryUIStateFactory$createTicketInfoUIState$1.L$5;
                userDetailsForProducts4 = (UserDetailsForProducts) productSummaryUIStateFactory$createTicketInfoUIState$1.L$4;
                list5 = (List) productSummaryUIStateFactory$createTicketInfoUIState$1.L$3;
                str5 = (String) productSummaryUIStateFactory$createTicketInfoUIState$1.L$2;
                ticketBooking5 = (ChaloUserBookingType.TicketBooking) productSummaryUIStateFactory$createTicketInfoUIState$1.L$1;
                productReceiptData5 = (ProductReceiptData) productSummaryUIStateFactory$createTicketInfoUIState$1.L$0;
                ResultKt.b(obj2);
                chaloTextStyleHelper6 = chaloTextStyleHelper13;
                titleSubtitleUiState10 = titleSubtitleUiState21;
                chaloTextStyleHelper5 = chaloTextStyleHelper7;
                timeUtilsContract = timeUtilsContract;
                str8 = (String) obj2;
                List list11 = list5;
                ticketBooking6 = ticketBooking5;
                j2 = j;
                function5 = function6;
                list6 = list11;
                textWithLeftAndRightIconUIState4 = textWithLeftAndRightIconUIState2;
                titleSubtitleUiState12 = titleSubtitleUiState10;
                userDetailsForProducts3 = userDetailsForProducts4;
                str7 = str5;
                TitleSubtitleUiState titleSubtitleUiState112 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper6, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper5, TimeUtilsContract.DefaultImpls.a(timeUtilsContract, j2, str7, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                productReceiptData3 = productReceiptData5;
                titleSubtitleUiState6 = titleSubtitleUiState12;
                textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState4;
                list4 = list6;
                titleSubtitleUiState9 = titleSubtitleUiState112;
                ticketBooking3 = ticketBooking6;
                if (productReceiptData3 != null) {
                    i = productReceiptData3.getI();
                } else {
                    i = null;
                }
                if (productReceiptData3 != null) {
                    g = productReceiptData3.getG();
                } else {
                    g = null;
                }
                if (productReceiptData3 != null) {
                    h = productReceiptData3.getH();
                } else {
                    h = null;
                }
                if (i != null || i.length() == 0 || g == null || g.length() == 0 || h == null || h.length() == 0) {
                    routeDetailInfoUIState = null;
                } else {
                    ChaloTextStyleHelper chaloTextStyleHelper14 = chaloTextStyleHelper5;
                    routeDetailInfoUIState = new RouteDetailInfoUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper14, i, null, null, UIFontWeight.SemiBold, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper14, g, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper14, h, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), SpecialFeaturesTagListUIStateFactory.a(list4));
                }
                if (userDetailsForProducts3 != null) {
                    e3 = userDetailsForProducts3.getE();
                } else {
                    e3 = null;
                }
                if (userDetailsForProducts3 != null) {
                    c = userDetailsForProducts3.getC();
                } else {
                    c = null;
                }
                if (c != null) {
                    if (e3 != null) {
                        ImageUISize imageUISize4 = new ImageUISize(ChaloThemeHelper.a().m);
                        UIContentScale uIContentScale4 = UIContentScale.Crop;
                        if (function5 != null) {
                            uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new tx0(function5, userDetailsForProducts3, 0));
                        } else {
                            uiEventHandler$Companion$fromLambda$1A = null;
                        }
                        imageUrlUIState = new ImageUrlUIState(e3, imageUISize4, uIContentScale4, uiEventHandler$Companion$fromLambda$1A, 38);
                    } else {
                        imageUrlUIState = null;
                    }
                    if (AnyExtsKt.a(userDetailsForProducts3.e())) {
                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.e(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    } else {
                        chaloTextUIStateC = null;
                    }
                    if (AnyExtsKt.a(userDetailsForProducts3.getC())) {
                        chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.getC(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    } else {
                        chaloTextUIStateC2 = null;
                    }
                    if (AnyExtsKt.a(userDetailsForProducts3.b())) {
                        chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.b(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    } else {
                        chaloTextUIStateC3 = null;
                    }
                    userInfoUIState = new UserInfoUIState(imageUrlUIState, new ImageUIState(IconType.IC_PROFILE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.FillBounds, 0.0f, (UiEventHandler) null, 230), chaloTextUIStateC2, chaloTextUIStateC, chaloTextUIStateC3);
                } else {
                    userInfoUIState = null;
                }
                if (titleSubtitleUiState5 != null && textWithLeftAndRightIconUIState == null && routeDetailInfoUIState == null && titleSubtitleUiState4 == null && titleSubtitleUiState6 == null && titleSubtitleUiState9 == null && userInfoUIState == null) {
                    return null;
                }
                arrayList = new ArrayList();
                if (routeDetailInfoUIState != null) {
                    arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(routeDetailInfoUIState));
                } else if (ticketBooking3 instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
                    MetroTicketAppModel metroTicketAppModel4 = ((ChaloUserBookingType.TicketBooking.MetroTicketBooking) ticketBooking3).d;
                    metroTicketStopDetails = metroTicketAppModel4.n;
                    str9 = "";
                    if (metroTicketStopDetails != null || (str10 = metroTicketStopDetails.f5434a) == null) {
                        str10 = "";
                    }
                    TextUIState.ChaloTextUIState chaloTextUIStateC11 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, str10, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    metroTicketStopDetails2 = metroTicketAppModel4.o;
                    if (metroTicketStopDetails2 != null && (str11 = metroTicketStopDetails2.f5434a) != null) {
                        str9 = str11;
                    }
                    arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(new RouteDetailInfoUIState(null, chaloTextUIStateC11, ChaloTextStyleHelper.c(chaloTextStyleHelper5, str9, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new SpecialFeaturesTagListUIState(EmptyList.f17557a))));
                }
                if (titleSubtitleUiState5 != null) {
                    arrayList.add(new TicketInfoContentUIState.ValidatedAt(titleSubtitleUiState5));
                }
                if (titleSubtitleUiState9 != null) {
                    arrayList.add(new TicketInfoContentUIState.ExpiredAt(titleSubtitleUiState9));
                }
                if (titleSubtitleUiState4 != null) {
                    arrayList.add(new TicketInfoContentUIState.VehicleNumber(titleSubtitleUiState4));
                }
                if (textWithLeftAndRightIconUIState != null) {
                    arrayList.add(new TicketInfoContentUIState.NumberOfTickets(textWithLeftAndRightIconUIState));
                }
                if (titleSubtitleUiState6 != null) {
                    arrayList.add(new TicketInfoContentUIState.ConductorId(titleSubtitleUiState6));
                }
                if (userInfoUIState != null) {
                    arrayList.add(new TicketInfoContentUIState.UserInfo(userInfoUIState));
                }
                return new TicketInfoUIState(arrayList, new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, DividerOrientation.Horizontal), 4);
            }
            boolean z5 = productSummaryUIStateFactory$createTicketInfoUIState$1.Z$0;
            ChaloTextStyleHelper chaloTextStyleHelper15 = (ChaloTextStyleHelper) productSummaryUIStateFactory$createTicketInfoUIState$1.L$10;
            titleSubtitleUiState7 = (TitleSubtitleUiState) productSummaryUIStateFactory$createTicketInfoUIState$1.L$9;
            TitleSubtitleUiState titleSubtitleUiState22 = (TitleSubtitleUiState) productSummaryUIStateFactory$createTicketInfoUIState$1.L$8;
            function3 = (Function1) productSummaryUIStateFactory$createTicketInfoUIState$1.L$7;
            userDetailsForProducts2 = (UserDetailsForProducts) productSummaryUIStateFactory$createTicketInfoUIState$1.L$6;
            list2 = (List) productSummaryUIStateFactory$createTicketInfoUIState$1.L$5;
            l3 = (Long) productSummaryUIStateFactory$createTicketInfoUIState$1.L$4;
            String str14 = (String) productSummaryUIStateFactory$createTicketInfoUIState$1.L$3;
            map3 = (Map) productSummaryUIStateFactory$createTicketInfoUIState$1.L$2;
            ChaloUserBookingType.TicketBooking ticketBooking8 = (ChaloUserBookingType.TicketBooking) productSummaryUIStateFactory$createTicketInfoUIState$1.L$1;
            productReceiptData2 = (ProductReceiptData) productSummaryUIStateFactory$createTicketInfoUIState$1.L$0;
            ResultKt.b(obj2);
            timeUtilsContract = timeUtilsContract;
            str6 = str14;
            z2 = z5;
            coroutineSingletons = coroutineSingletons3;
            chaloTextStyleHelper4 = chaloTextStyleHelper15;
            titleSubtitleUiState8 = titleSubtitleUiState22;
            ticketBooking = ticketBooking8;
            TextUIState.ChaloTextUIState chaloTextUIStateC12 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) obj2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            if (productReceiptData2 != null || (f2 = productReceiptData2.getF()) == null) {
                chaloTextUIStateG2 = null;
            } else {
                chaloTextUIStateG2 = ChaloTextStyleHelper.g(chaloTextStyleHelper7, f2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
            titleSubtitleUiState6 = new TitleSubtitleUiState(null, chaloTextUIStateC12, chaloTextUIStateG2, null, 9);
            TitleSubtitleUiState titleSubtitleUiState113 = titleSubtitleUiState8;
            productReceiptData3 = productReceiptData2;
            ticketBooking3 = ticketBooking;
            list4 = list2;
            titleSubtitleUiState5 = titleSubtitleUiState113;
            userDetailsForProducts3 = userDetailsForProducts2;
            titleSubtitleUiState4 = titleSubtitleUiState7;
            function5 = function3;
            str5 = str6;
            if (productReceiptData3 != null && (j3 = productReceiptData3.getJ()) != null) {
                map3 = j3;
            }
            if (map3 != null) {
                ChaloTextStyleHelper chaloTextStyleHelper16 = chaloTextStyleHelper7;
                ImageUIState imageUIState3 = new ImageUIState(IconType.IC_ICON_TICKET_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                sb = new StringBuilder();
                it = map3.entrySet().iterator();
                z3 = false;
                while (it.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it.next();
                    String str15 = (String) entry3.getKey();
                    Iterator it4 = it;
                    int iIntValue3 = ((Number) entry3.getValue()).intValue();
                    if (z3) {
                        sb.append(",");
                    }
                    sb.append(iIntValue3);
                    sb.append(" ");
                    sb.append(StringExtsKt.a(str15));
                    it = it4;
                    z3 = true;
                }
                String string3 = sb.toString();
                Intrinsics.h(string3, "toString(...)");
                chaloTextStyleHelper5 = chaloTextStyleHelper16;
                textWithLeftAndRightIconUIState = new TextWithLeftAndRightIconUIState(imageUIState3, ChaloTextStyleHelper.g(chaloTextStyleHelper16, string3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 0.0f, null, 28);
            } else {
                chaloTextStyleHelper5 = chaloTextStyleHelper7;
                textWithLeftAndRightIconUIState = null;
            }
            if (l3 != 0) {
                jLongValue = l3.longValue();
                if (z2) {
                    coroutineSingletons2 = coroutineSingletons;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = str5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = list4;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = userDetailsForProducts3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = function5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = titleSubtitleUiState5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = titleSubtitleUiState4;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState6;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = textWithLeftAndRightIconUIState;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$10 = chaloTextStyleHelper5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.J$0 = jLongValue;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.label = 4;
                    objB4 = stringProvider.b(StringEnum.EXPIRED_AT, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                    if (objB4 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    ticketBooking6 = ticketBooking3;
                    list6 = list4;
                    str7 = str5;
                    titleSubtitleUiState11 = titleSubtitleUiState5;
                    titleSubtitleUiState12 = titleSubtitleUiState6;
                    obj2 = objB4;
                    userDetailsForProducts5 = userDetailsForProducts3;
                    textWithLeftAndRightIconUIState3 = textWithLeftAndRightIconUIState;
                    chaloTextStyleHelper6 = chaloTextStyleHelper5;
                    productReceiptData5 = productReceiptData3;
                    j2 = jLongValue;
                    str8 = (String) obj2;
                    textWithLeftAndRightIconUIState4 = textWithLeftAndRightIconUIState3;
                    userDetailsForProducts3 = userDetailsForProducts5;
                    titleSubtitleUiState5 = titleSubtitleUiState11;
                    TitleSubtitleUiState titleSubtitleUiState114 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper6, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper5, TimeUtilsContract.DefaultImpls.a(timeUtilsContract, j2, str7, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                    productReceiptData3 = productReceiptData5;
                    titleSubtitleUiState6 = titleSubtitleUiState12;
                    textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState4;
                    list4 = list6;
                    titleSubtitleUiState9 = titleSubtitleUiState114;
                    ticketBooking3 = ticketBooking6;
                } else {
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = str5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = list4;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = userDetailsForProducts3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = function5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = titleSubtitleUiState5;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = titleSubtitleUiState4;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState6;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = textWithLeftAndRightIconUIState;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.L$10 = chaloTextStyleHelper5;
                    ticketBooking4 = ticketBooking3;
                    productReceiptData4 = productReceiptData3;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.J$0 = jLongValue;
                    productSummaryUIStateFactory$createTicketInfoUIState$1.label = 5;
                    objB3 = stringProvider.b(StringEnum.VALID_TILL, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                    if (objB3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    productReceiptData5 = productReceiptData4;
                    function6 = function5;
                    userDetailsForProducts4 = userDetailsForProducts3;
                    list5 = list4;
                    textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                    chaloTextStyleHelper6 = chaloTextStyleHelper5;
                    j = jLongValue;
                    titleSubtitleUiState10 = titleSubtitleUiState6;
                    obj2 = objB3;
                    ticketBooking5 = ticketBooking4;
                    str8 = (String) obj2;
                    List list12 = list5;
                    ticketBooking6 = ticketBooking5;
                    j2 = j;
                    function5 = function6;
                    list6 = list12;
                    textWithLeftAndRightIconUIState4 = textWithLeftAndRightIconUIState2;
                    titleSubtitleUiState12 = titleSubtitleUiState10;
                    userDetailsForProducts3 = userDetailsForProducts4;
                    str7 = str5;
                    TitleSubtitleUiState titleSubtitleUiState115 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper6, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper5, TimeUtilsContract.DefaultImpls.a(timeUtilsContract, j2, str7, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                    productReceiptData3 = productReceiptData5;
                    titleSubtitleUiState6 = titleSubtitleUiState12;
                    textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState4;
                    list4 = list6;
                    titleSubtitleUiState9 = titleSubtitleUiState115;
                    ticketBooking3 = ticketBooking6;
                }
            } else {
                titleSubtitleUiState9 = null;
            }
            if (productReceiptData3 != null) {
                i = productReceiptData3.getI();
            } else {
                i = null;
            }
            if (productReceiptData3 != null) {
                g = productReceiptData3.getG();
            } else {
                g = null;
            }
            if (productReceiptData3 != null) {
                h = productReceiptData3.getH();
            } else {
                h = null;
            }
            if (i != null) {
                routeDetailInfoUIState = null;
            } else {
                routeDetailInfoUIState = null;
            }
            if (userDetailsForProducts3 != null) {
                e3 = userDetailsForProducts3.getE();
            } else {
                e3 = null;
            }
            if (userDetailsForProducts3 != null) {
                c = userDetailsForProducts3.getC();
            } else {
                c = null;
            }
            if (c != null) {
                if (e3 != null) {
                    ImageUISize imageUISize5 = new ImageUISize(ChaloThemeHelper.a().m);
                    UIContentScale uIContentScale5 = UIContentScale.Crop;
                    if (function5 != null) {
                        uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new tx0(function5, userDetailsForProducts3, 0));
                    } else {
                        uiEventHandler$Companion$fromLambda$1A = null;
                    }
                    imageUrlUIState = new ImageUrlUIState(e3, imageUISize5, uIContentScale5, uiEventHandler$Companion$fromLambda$1A, 38);
                } else {
                    imageUrlUIState = null;
                }
                if (AnyExtsKt.a(userDetailsForProducts3.e())) {
                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.e(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                } else {
                    chaloTextUIStateC = null;
                }
                if (AnyExtsKt.a(userDetailsForProducts3.getC())) {
                    chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.getC(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                } else {
                    chaloTextUIStateC2 = null;
                }
                if (AnyExtsKt.a(userDetailsForProducts3.b())) {
                    chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.b(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                } else {
                    chaloTextUIStateC3 = null;
                }
                userInfoUIState = new UserInfoUIState(imageUrlUIState, new ImageUIState(IconType.IC_PROFILE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.FillBounds, 0.0f, (UiEventHandler) null, 230), chaloTextUIStateC2, chaloTextUIStateC, chaloTextUIStateC3);
            } else {
                userInfoUIState = null;
            }
            if (titleSubtitleUiState5 != null) {
            }
            arrayList = new ArrayList();
            if (routeDetailInfoUIState != null) {
                arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(routeDetailInfoUIState));
            } else if (ticketBooking3 instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
                MetroTicketAppModel metroTicketAppModel5 = ((ChaloUserBookingType.TicketBooking.MetroTicketBooking) ticketBooking3).d;
                metroTicketStopDetails = metroTicketAppModel5.n;
                str9 = "";
                if (metroTicketStopDetails != null) {
                    str10 = "";
                } else {
                    str10 = "";
                }
                TextUIState.ChaloTextUIState chaloTextUIStateC13 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, str10, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                metroTicketStopDetails2 = metroTicketAppModel5.o;
                if (metroTicketStopDetails2 != null) {
                    str9 = str11;
                }
                arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(new RouteDetailInfoUIState(null, chaloTextUIStateC13, ChaloTextStyleHelper.c(chaloTextStyleHelper5, str9, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new SpecialFeaturesTagListUIState(EmptyList.f17557a))));
            }
            if (titleSubtitleUiState5 != null) {
                arrayList.add(new TicketInfoContentUIState.ValidatedAt(titleSubtitleUiState5));
            }
            if (titleSubtitleUiState9 != null) {
                arrayList.add(new TicketInfoContentUIState.ExpiredAt(titleSubtitleUiState9));
            }
            if (titleSubtitleUiState4 != null) {
                arrayList.add(new TicketInfoContentUIState.VehicleNumber(titleSubtitleUiState4));
            }
            if (textWithLeftAndRightIconUIState != null) {
                arrayList.add(new TicketInfoContentUIState.NumberOfTickets(textWithLeftAndRightIconUIState));
            }
            if (titleSubtitleUiState6 != null) {
                arrayList.add(new TicketInfoContentUIState.ConductorId(titleSubtitleUiState6));
            }
            if (userInfoUIState != null) {
                arrayList.add(new TicketInfoContentUIState.UserInfo(userInfoUIState));
            }
            return new TicketInfoUIState(arrayList, new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, DividerOrientation.Horizontal), 4);
        }
        boolean z6 = productSummaryUIStateFactory$createTicketInfoUIState$1.Z$0;
        ChaloTextStyleHelper chaloTextStyleHelper17 = (ChaloTextStyleHelper) productSummaryUIStateFactory$createTicketInfoUIState$1.L$9;
        String str16 = (String) productSummaryUIStateFactory$createTicketInfoUIState$1.L$8;
        Function1 function8 = (Function1) productSummaryUIStateFactory$createTicketInfoUIState$1.L$7;
        userDetailsForProducts = (UserDetailsForProducts) productSummaryUIStateFactory$createTicketInfoUIState$1.L$6;
        List list13 = (List) productSummaryUIStateFactory$createTicketInfoUIState$1.L$5;
        l2 = (Long) productSummaryUIStateFactory$createTicketInfoUIState$1.L$4;
        str2 = (String) productSummaryUIStateFactory$createTicketInfoUIState$1.L$3;
        Map map7 = (Map) productSummaryUIStateFactory$createTicketInfoUIState$1.L$2;
        ChaloUserBookingType.TicketBooking ticketBooking9 = (ChaloUserBookingType.TicketBooking) productSummaryUIStateFactory$createTicketInfoUIState$1.L$1;
        productReceiptData2 = (ProductReceiptData) productSummaryUIStateFactory$createTicketInfoUIState$1.L$0;
        ResultKt.b(obj2);
        str3 = str16;
        obj = obj2;
        function2 = function8;
        ticketBooking = ticketBooking9;
        chaloTextStyleHelper2 = chaloTextStyleHelper17;
        list2 = list13;
        map2 = map7;
        z2 = z6;
        chaloTextStyleHelper = chaloTextStyleHelper7;
        titleSubtitleUiState = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper7, str3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
        if (productReceiptData2 != null) {
            e = productReceiptData2.getE();
        } else {
            e = null;
        }
        if (AnyExtsKt.a(e)) {
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = map2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = str2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = l2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = list2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = userDetailsForProducts;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = function2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = chaloTextStyleHelper;
            productSummaryUIStateFactory$createTicketInfoUIState$1.Z$0 = z2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.label = 2;
            objB = stringProvider.b(StringEnum.VEHICLE_NUMBER, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
            coroutineSingletons = coroutineSingletons3;
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            ChaloUserBookingType.TicketBooking ticketBooking10 = ticketBooking;
            function4 = function2;
            titleSubtitleUiState2 = titleSubtitleUiState;
            obj2 = objB;
            map4 = map2;
            list3 = list2;
            l4 = l2;
            ticketBooking2 = ticketBooking10;
            chaloTextStyleHelper3 = chaloTextStyleHelper;
            TextUIState.ChaloTextUIState chaloTextUIStateC14 = ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) obj2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            if (productReceiptData2 != null) {
                chaloTextStyleHelper7 = chaloTextStyleHelper;
                chaloTextUIStateG = null;
            } else {
                chaloTextStyleHelper7 = chaloTextStyleHelper;
                chaloTextUIStateG = null;
            }
            titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC14, chaloTextUIStateG, null, 9);
            List list14 = list3;
            function3 = function4;
            ticketBooking = ticketBooking2;
            userDetailsForProducts2 = userDetailsForProducts;
            l3 = l4;
            list2 = list14;
            str4 = str2;
            map3 = map4;
        } else {
            chaloTextStyleHelper7 = chaloTextStyleHelper;
            timeUtilsContract = timeUtilsContract;
            coroutineSingletons = coroutineSingletons3;
            Map map8 = map2;
            function3 = function2;
            titleSubtitleUiState2 = titleSubtitleUiState;
            str4 = str2;
            map3 = map8;
            Long l6 = l2;
            userDetailsForProducts2 = userDetailsForProducts;
            l3 = l6;
            titleSubtitleUiState3 = null;
        }
        if (productReceiptData2 != null) {
            f = productReceiptData2.getF();
        } else {
            f = null;
        }
        if (AnyExtsKt.a(f)) {
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = map3;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = str4;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = l3;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = list2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = userDetailsForProducts2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = function3;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = titleSubtitleUiState3;
            productSummaryUIStateFactory$createTicketInfoUIState$1.L$10 = chaloTextStyleHelper7;
            productSummaryUIStateFactory$createTicketInfoUIState$1.Z$0 = z2;
            productSummaryUIStateFactory$createTicketInfoUIState$1.label = 3;
            objB2 = stringProvider.b(StringEnum.VEHICLE_NUMBER, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
            coroutineSingletons = coroutineSingletons;
            if (objB2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            TitleSubtitleUiState titleSubtitleUiState116 = titleSubtitleUiState2;
            titleSubtitleUiState7 = titleSubtitleUiState3;
            titleSubtitleUiState8 = titleSubtitleUiState116;
            str6 = str4;
            obj2 = objB2;
            chaloTextStyleHelper4 = chaloTextStyleHelper7;
            TextUIState.ChaloTextUIState chaloTextUIStateC15 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) obj2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            if (productReceiptData2 != null) {
                chaloTextUIStateG2 = null;
            } else {
                chaloTextUIStateG2 = null;
            }
            titleSubtitleUiState6 = new TitleSubtitleUiState(null, chaloTextUIStateC15, chaloTextUIStateG2, null, 9);
            TitleSubtitleUiState titleSubtitleUiState117 = titleSubtitleUiState8;
            productReceiptData3 = productReceiptData2;
            ticketBooking3 = ticketBooking;
            list4 = list2;
            titleSubtitleUiState5 = titleSubtitleUiState117;
            userDetailsForProducts3 = userDetailsForProducts2;
            titleSubtitleUiState4 = titleSubtitleUiState7;
            function5 = function3;
            str5 = str6;
        } else {
            userDetailsForProducts3 = userDetailsForProducts2;
            titleSubtitleUiState4 = titleSubtitleUiState3;
            productReceiptData3 = productReceiptData2;
            ticketBooking3 = ticketBooking;
            list4 = list2;
            titleSubtitleUiState5 = titleSubtitleUiState2;
            function5 = function3;
            str5 = str4;
            titleSubtitleUiState6 = null;
        }
        if (productReceiptData3 != null) {
            map3 = j3;
        }
        if (map3 != null) {
            ChaloTextStyleHelper chaloTextStyleHelper18 = chaloTextStyleHelper7;
            ImageUIState imageUIState4 = new ImageUIState(IconType.IC_ICON_TICKET_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            sb = new StringBuilder();
            it = map3.entrySet().iterator();
            z3 = false;
            while (it.hasNext()) {
                Map.Entry entry4 = (Map.Entry) it.next();
                String str17 = (String) entry4.getKey();
                Iterator it5 = it;
                int iIntValue4 = ((Number) entry4.getValue()).intValue();
                if (z3) {
                    sb.append(",");
                }
                sb.append(iIntValue4);
                sb.append(" ");
                sb.append(StringExtsKt.a(str17));
                it = it5;
                z3 = true;
            }
            String string4 = sb.toString();
            Intrinsics.h(string4, "toString(...)");
            chaloTextStyleHelper5 = chaloTextStyleHelper18;
            textWithLeftAndRightIconUIState = new TextWithLeftAndRightIconUIState(imageUIState4, ChaloTextStyleHelper.g(chaloTextStyleHelper18, string4, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 0.0f, null, 28);
        } else {
            chaloTextStyleHelper5 = chaloTextStyleHelper7;
            textWithLeftAndRightIconUIState = null;
        }
        if (l3 != 0) {
            jLongValue = l3.longValue();
            if (z2) {
                coroutineSingletons2 = coroutineSingletons;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData3;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking3;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = str5;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = list4;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = userDetailsForProducts3;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = function5;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = titleSubtitleUiState5;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = titleSubtitleUiState4;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState6;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = textWithLeftAndRightIconUIState;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$10 = chaloTextStyleHelper5;
                productSummaryUIStateFactory$createTicketInfoUIState$1.J$0 = jLongValue;
                productSummaryUIStateFactory$createTicketInfoUIState$1.label = 4;
                objB4 = stringProvider.b(StringEnum.EXPIRED_AT, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                ticketBooking6 = ticketBooking3;
                list6 = list4;
                str7 = str5;
                titleSubtitleUiState11 = titleSubtitleUiState5;
                titleSubtitleUiState12 = titleSubtitleUiState6;
                obj2 = objB4;
                userDetailsForProducts5 = userDetailsForProducts3;
                textWithLeftAndRightIconUIState3 = textWithLeftAndRightIconUIState;
                chaloTextStyleHelper6 = chaloTextStyleHelper5;
                productReceiptData5 = productReceiptData3;
                j2 = jLongValue;
                str8 = (String) obj2;
                textWithLeftAndRightIconUIState4 = textWithLeftAndRightIconUIState3;
                userDetailsForProducts3 = userDetailsForProducts5;
                titleSubtitleUiState5 = titleSubtitleUiState11;
                TitleSubtitleUiState titleSubtitleUiState118 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper6, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper5, TimeUtilsContract.DefaultImpls.a(timeUtilsContract, j2, str7, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                productReceiptData3 = productReceiptData5;
                titleSubtitleUiState6 = titleSubtitleUiState12;
                textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState4;
                list4 = list6;
                titleSubtitleUiState9 = titleSubtitleUiState118;
                ticketBooking3 = ticketBooking6;
            } else {
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$0 = productReceiptData3;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$1 = ticketBooking3;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$2 = str5;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$3 = list4;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$4 = userDetailsForProducts3;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$5 = function5;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$6 = titleSubtitleUiState5;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$7 = titleSubtitleUiState4;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$8 = titleSubtitleUiState6;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$9 = textWithLeftAndRightIconUIState;
                productSummaryUIStateFactory$createTicketInfoUIState$1.L$10 = chaloTextStyleHelper5;
                ticketBooking4 = ticketBooking3;
                productReceiptData4 = productReceiptData3;
                productSummaryUIStateFactory$createTicketInfoUIState$1.J$0 = jLongValue;
                productSummaryUIStateFactory$createTicketInfoUIState$1.label = 5;
                objB3 = stringProvider.b(StringEnum.VALID_TILL, new Object[0], productSummaryUIStateFactory$createTicketInfoUIState$1);
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                productReceiptData5 = productReceiptData4;
                function6 = function5;
                userDetailsForProducts4 = userDetailsForProducts3;
                list5 = list4;
                textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                chaloTextStyleHelper6 = chaloTextStyleHelper5;
                j = jLongValue;
                titleSubtitleUiState10 = titleSubtitleUiState6;
                obj2 = objB3;
                ticketBooking5 = ticketBooking4;
                str8 = (String) obj2;
                List list15 = list5;
                ticketBooking6 = ticketBooking5;
                j2 = j;
                function5 = function6;
                list6 = list15;
                textWithLeftAndRightIconUIState4 = textWithLeftAndRightIconUIState2;
                titleSubtitleUiState12 = titleSubtitleUiState10;
                userDetailsForProducts3 = userDetailsForProducts4;
                str7 = str5;
                TitleSubtitleUiState titleSubtitleUiState119 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper6, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper5, TimeUtilsContract.DefaultImpls.a(timeUtilsContract, j2, str7, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                productReceiptData3 = productReceiptData5;
                titleSubtitleUiState6 = titleSubtitleUiState12;
                textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState4;
                list4 = list6;
                titleSubtitleUiState9 = titleSubtitleUiState119;
                ticketBooking3 = ticketBooking6;
            }
        } else {
            titleSubtitleUiState9 = null;
        }
        if (productReceiptData3 != null) {
            i = productReceiptData3.getI();
        } else {
            i = null;
        }
        if (productReceiptData3 != null) {
            g = productReceiptData3.getG();
        } else {
            g = null;
        }
        if (productReceiptData3 != null) {
            h = productReceiptData3.getH();
        } else {
            h = null;
        }
        if (i != null) {
            routeDetailInfoUIState = null;
        } else {
            routeDetailInfoUIState = null;
        }
        if (userDetailsForProducts3 != null) {
            e3 = userDetailsForProducts3.getE();
        } else {
            e3 = null;
        }
        if (userDetailsForProducts3 != null) {
            c = userDetailsForProducts3.getC();
        } else {
            c = null;
        }
        if (c != null) {
            if (e3 != null) {
                ImageUISize imageUISize6 = new ImageUISize(ChaloThemeHelper.a().m);
                UIContentScale uIContentScale6 = UIContentScale.Crop;
                if (function5 != null) {
                    uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new tx0(function5, userDetailsForProducts3, 0));
                } else {
                    uiEventHandler$Companion$fromLambda$1A = null;
                }
                imageUrlUIState = new ImageUrlUIState(e3, imageUISize6, uIContentScale6, uiEventHandler$Companion$fromLambda$1A, 38);
            } else {
                imageUrlUIState = null;
            }
            if (AnyExtsKt.a(userDetailsForProducts3.e())) {
                chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.e(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            } else {
                chaloTextUIStateC = null;
            }
            if (AnyExtsKt.a(userDetailsForProducts3.getC())) {
                chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.getC(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            } else {
                chaloTextUIStateC2 = null;
            }
            if (AnyExtsKt.a(userDetailsForProducts3.b())) {
                chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, userDetailsForProducts3.b(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            } else {
                chaloTextUIStateC3 = null;
            }
            userInfoUIState = new UserInfoUIState(imageUrlUIState, new ImageUIState(IconType.IC_PROFILE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.FillBounds, 0.0f, (UiEventHandler) null, 230), chaloTextUIStateC2, chaloTextUIStateC, chaloTextUIStateC3);
        } else {
            userInfoUIState = null;
        }
        if (titleSubtitleUiState5 != null) {
        }
        arrayList = new ArrayList();
        if (routeDetailInfoUIState != null) {
            arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(routeDetailInfoUIState));
        } else if (ticketBooking3 instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) {
            MetroTicketAppModel metroTicketAppModel6 = ((ChaloUserBookingType.TicketBooking.MetroTicketBooking) ticketBooking3).d;
            metroTicketStopDetails = metroTicketAppModel6.n;
            str9 = "";
            if (metroTicketStopDetails != null) {
                str10 = "";
            } else {
                str10 = "";
            }
            TextUIState.ChaloTextUIState chaloTextUIStateC16 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, str10, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            metroTicketStopDetails2 = metroTicketAppModel6.o;
            if (metroTicketStopDetails2 != null) {
                str9 = str11;
            }
            arrayList.add(new TicketInfoContentUIState.RouteDetailInfo(new RouteDetailInfoUIState(null, chaloTextUIStateC16, ChaloTextStyleHelper.c(chaloTextStyleHelper5, str9, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new SpecialFeaturesTagListUIState(EmptyList.f17557a))));
        }
        if (titleSubtitleUiState5 != null) {
            arrayList.add(new TicketInfoContentUIState.ValidatedAt(titleSubtitleUiState5));
        }
        if (titleSubtitleUiState9 != null) {
            arrayList.add(new TicketInfoContentUIState.ExpiredAt(titleSubtitleUiState9));
        }
        if (titleSubtitleUiState4 != null) {
            arrayList.add(new TicketInfoContentUIState.VehicleNumber(titleSubtitleUiState4));
        }
        if (textWithLeftAndRightIconUIState != null) {
            arrayList.add(new TicketInfoContentUIState.NumberOfTickets(textWithLeftAndRightIconUIState));
        }
        if (titleSubtitleUiState6 != null) {
            arrayList.add(new TicketInfoContentUIState.ConductorId(titleSubtitleUiState6));
        }
        if (userInfoUIState != null) {
            arrayList.add(new TicketInfoContentUIState.UserInfo(userInfoUIState));
        }
        return new TicketInfoUIState(arrayList, new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, DividerOrientation.Horizontal), 4);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0140  */
    /* JADX WARN: Code duplicated, block: B:34:0x0172  */
    /* JADX WARN: Code duplicated, block: B:37:0x0189  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        ProductSummaryUIStateFactory$getBookingDetailsState$1 productSummaryUIStateFactory$getBookingDetailsState$1;
        String str4;
        String str5;
        String str6;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIState;
        String str7;
        String str8;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        String str9;
        TitleSubtitleUiState titleSubtitleUiState;
        Object objB;
        String str10;
        TitleSubtitleUiState titleSubtitleUiState2;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        TitleSubtitleUiState titleSubtitleUiState3;
        TitleSubtitleUiState titleSubtitleUiState4;
        TitleSubtitleUiState titleSubtitleUiState5;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TitleSubtitleUiState titleSubtitleUiState6;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        String str11;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        if (continuationImpl instanceof ProductSummaryUIStateFactory$getBookingDetailsState$1) {
            productSummaryUIStateFactory$getBookingDetailsState$1 = (ProductSummaryUIStateFactory$getBookingDetailsState$1) continuationImpl;
            int i = productSummaryUIStateFactory$getBookingDetailsState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSummaryUIStateFactory$getBookingDetailsState$1.label = i - Integer.MIN_VALUE;
            } else {
                productSummaryUIStateFactory$getBookingDetailsState$1 = new ProductSummaryUIStateFactory$getBookingDetailsState$1(this, continuationImpl);
            }
        } else {
            productSummaryUIStateFactory$getBookingDetailsState$1 = new ProductSummaryUIStateFactory$getBookingDetailsState$1(this, continuationImpl);
        }
        Object objB2 = productSummaryUIStateFactory$getBookingDetailsState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSummaryUIStateFactory$getBookingDetailsState$1.label;
        StringProvider stringProvider = this.b;
        ChaloTextStyleHelper chaloTextStyleHelper5 = ChaloTextStyleHelper.f10078a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            str4 = str;
            productSummaryUIStateFactory$getBookingDetailsState$1.L$0 = str4;
            str5 = str2;
            productSummaryUIStateFactory$getBookingDetailsState$1.L$1 = str5;
            str6 = str3;
            productSummaryUIStateFactory$getBookingDetailsState$1.L$2 = str6;
            productSummaryUIStateFactory$getBookingDetailsState$1.L$3 = chaloTextStyleHelper5;
            productSummaryUIStateFactory$getBookingDetailsState$1.label = 1;
            objB2 = stringProvider.b(StringEnum.BOOKING_DETAILS, new Object[0], productSummaryUIStateFactory$getBookingDetailsState$1);
            if (objB2 != coroutineSingletons) {
                chaloTextStyleHelper = chaloTextStyleHelper5;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper6 = (ChaloTextStyleHelper) productSummaryUIStateFactory$getBookingDetailsState$1.L$3;
            String str12 = (String) productSummaryUIStateFactory$getBookingDetailsState$1.L$2;
            String str13 = (String) productSummaryUIStateFactory$getBookingDetailsState$1.L$1;
            String str14 = (String) productSummaryUIStateFactory$getBookingDetailsState$1.L$0;
            ResultKt.b(objB2);
            str5 = str13;
            str4 = str14;
            chaloTextStyleHelper = chaloTextStyleHelper6;
            str6 = str12;
        } else {
            if (i2 == 2) {
                ChaloTextStyleHelper chaloTextStyleHelper7 = (ChaloTextStyleHelper) productSummaryUIStateFactory$getBookingDetailsState$1.L$4;
                chaloTextUIState = (TextUIState.ChaloTextUIState) productSummaryUIStateFactory$getBookingDetailsState$1.L$3;
                str8 = (String) productSummaryUIStateFactory$getBookingDetailsState$1.L$2;
                String str15 = (String) productSummaryUIStateFactory$getBookingDetailsState$1.L$1;
                String str16 = (String) productSummaryUIStateFactory$getBookingDetailsState$1.L$0;
                ResultKt.b(objB2);
                chaloTextStyleHelper2 = chaloTextStyleHelper7;
                str7 = str16;
                str5 = str15;
                str9 = str5;
                titleSubtitleUiState = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper5, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                productSummaryUIStateFactory$getBookingDetailsState$1.L$0 = str7;
                productSummaryUIStateFactory$getBookingDetailsState$1.L$1 = str9;
                productSummaryUIStateFactory$getBookingDetailsState$1.L$2 = chaloTextUIState;
                productSummaryUIStateFactory$getBookingDetailsState$1.L$3 = titleSubtitleUiState;
                productSummaryUIStateFactory$getBookingDetailsState$1.L$4 = chaloTextStyleHelper5;
                productSummaryUIStateFactory$getBookingDetailsState$1.label = 3;
                objB = stringProvider.b(StringEnum.BOOKING_ID, new Object[0], productSummaryUIStateFactory$getBookingDetailsState$1);
                if (objB != coroutineSingletons) {
                    str10 = str9;
                    objB2 = objB;
                    titleSubtitleUiState2 = titleSubtitleUiState;
                    chaloTextStyleHelper3 = chaloTextStyleHelper5;
                    titleSubtitleUiState3 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper5, str7, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                    if (AnyExtsKt.a(str10)) {
                        productSummaryUIStateFactory$getBookingDetailsState$1.L$0 = str10;
                        productSummaryUIStateFactory$getBookingDetailsState$1.L$1 = chaloTextUIState;
                        productSummaryUIStateFactory$getBookingDetailsState$1.L$2 = titleSubtitleUiState2;
                        productSummaryUIStateFactory$getBookingDetailsState$1.L$3 = titleSubtitleUiState3;
                        productSummaryUIStateFactory$getBookingDetailsState$1.L$4 = chaloTextStyleHelper5;
                        productSummaryUIStateFactory$getBookingDetailsState$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.PAYMENT_MODE, new Object[0], productSummaryUIStateFactory$getBookingDetailsState$1);
                        if (objB2 != coroutineSingletons) {
                            titleSubtitleUiState6 = titleSubtitleUiState2;
                            chaloTextUIState3 = chaloTextUIState;
                            str11 = str10;
                            chaloTextStyleHelper4 = chaloTextStyleHelper5;
                        }
                    } else {
                        titleSubtitleUiState4 = null;
                        titleSubtitleUiState5 = titleSubtitleUiState2;
                        chaloTextUIState2 = chaloTextUIState;
                    }
                    return new BookingDetailsUIState(chaloTextUIState2, titleSubtitleUiState5, titleSubtitleUiState3, null, titleSubtitleUiState4, null, null, 104);
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                ChaloTextStyleHelper chaloTextStyleHelper8 = (ChaloTextStyleHelper) productSummaryUIStateFactory$getBookingDetailsState$1.L$4;
                titleSubtitleUiState2 = (TitleSubtitleUiState) productSummaryUIStateFactory$getBookingDetailsState$1.L$3;
                chaloTextUIState = (TextUIState.ChaloTextUIState) productSummaryUIStateFactory$getBookingDetailsState$1.L$2;
                str10 = (String) productSummaryUIStateFactory$getBookingDetailsState$1.L$1;
                String str17 = (String) productSummaryUIStateFactory$getBookingDetailsState$1.L$0;
                ResultKt.b(objB2);
                chaloTextStyleHelper3 = chaloTextStyleHelper8;
                str7 = str17;
                titleSubtitleUiState3 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper5, str7, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                if (AnyExtsKt.a(str10)) {
                    productSummaryUIStateFactory$getBookingDetailsState$1.L$0 = str10;
                    productSummaryUIStateFactory$getBookingDetailsState$1.L$1 = chaloTextUIState;
                    productSummaryUIStateFactory$getBookingDetailsState$1.L$2 = titleSubtitleUiState2;
                    productSummaryUIStateFactory$getBookingDetailsState$1.L$3 = titleSubtitleUiState3;
                    productSummaryUIStateFactory$getBookingDetailsState$1.L$4 = chaloTextStyleHelper5;
                    productSummaryUIStateFactory$getBookingDetailsState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.PAYMENT_MODE, new Object[0], productSummaryUIStateFactory$getBookingDetailsState$1);
                    if (objB2 != coroutineSingletons) {
                        titleSubtitleUiState6 = titleSubtitleUiState2;
                        chaloTextUIState3 = chaloTextUIState;
                        str11 = str10;
                        chaloTextStyleHelper4 = chaloTextStyleHelper5;
                    }
                    return coroutineSingletons;
                }
                titleSubtitleUiState4 = null;
                titleSubtitleUiState5 = titleSubtitleUiState2;
                chaloTextUIState2 = chaloTextUIState;
                return new BookingDetailsUIState(chaloTextUIState2, titleSubtitleUiState5, titleSubtitleUiState3, null, titleSubtitleUiState4, null, null, 104);
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper9 = (ChaloTextStyleHelper) productSummaryUIStateFactory$getBookingDetailsState$1.L$4;
            titleSubtitleUiState3 = (TitleSubtitleUiState) productSummaryUIStateFactory$getBookingDetailsState$1.L$3;
            titleSubtitleUiState6 = (TitleSubtitleUiState) productSummaryUIStateFactory$getBookingDetailsState$1.L$2;
            chaloTextUIState3 = (TextUIState.ChaloTextUIState) productSummaryUIStateFactory$getBookingDetailsState$1.L$1;
            String str18 = (String) productSummaryUIStateFactory$getBookingDetailsState$1.L$0;
            ResultKt.b(objB2);
            str11 = str18;
            chaloTextStyleHelper4 = chaloTextStyleHelper9;
        }
        titleSubtitleUiState5 = titleSubtitleUiState6;
        chaloTextUIState2 = chaloTextUIState3;
        titleSubtitleUiState4 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), str11 != null ? ChaloTextStyleHelper.c(chaloTextStyleHelper5, str11, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT) : null, null, 9);
        return new BookingDetailsUIState(chaloTextUIState2, titleSubtitleUiState5, titleSubtitleUiState3, null, titleSubtitleUiState4, null, null, 104);
        TextUIState.ChaloTextUIState chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB2, ChaloColorToken.AlmostBlackColor.f9756a, null, null, 124);
        productSummaryUIStateFactory$getBookingDetailsState$1.L$0 = str4;
        productSummaryUIStateFactory$getBookingDetailsState$1.L$1 = str5;
        productSummaryUIStateFactory$getBookingDetailsState$1.L$2 = str6;
        productSummaryUIStateFactory$getBookingDetailsState$1.L$3 = chaloTextUIStateF;
        productSummaryUIStateFactory$getBookingDetailsState$1.L$4 = chaloTextStyleHelper5;
        productSummaryUIStateFactory$getBookingDetailsState$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.BOOKING_DATE, new Object[0], productSummaryUIStateFactory$getBookingDetailsState$1);
        if (objB3 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIStateF;
            objB2 = objB3;
            str7 = str4;
            str8 = str6;
            chaloTextStyleHelper2 = chaloTextStyleHelper5;
            str9 = str5;
            titleSubtitleUiState = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper5, str8, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
            productSummaryUIStateFactory$getBookingDetailsState$1.L$0 = str7;
            productSummaryUIStateFactory$getBookingDetailsState$1.L$1 = str9;
            productSummaryUIStateFactory$getBookingDetailsState$1.L$2 = chaloTextUIState;
            productSummaryUIStateFactory$getBookingDetailsState$1.L$3 = titleSubtitleUiState;
            productSummaryUIStateFactory$getBookingDetailsState$1.L$4 = chaloTextStyleHelper5;
            productSummaryUIStateFactory$getBookingDetailsState$1.label = 3;
            objB = stringProvider.b(StringEnum.BOOKING_ID, new Object[0], productSummaryUIStateFactory$getBookingDetailsState$1);
            if (objB != coroutineSingletons) {
                str10 = str9;
                objB2 = objB;
                titleSubtitleUiState2 = titleSubtitleUiState;
                chaloTextStyleHelper3 = chaloTextStyleHelper5;
                titleSubtitleUiState3 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper5, str7, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                if (AnyExtsKt.a(str10)) {
                    productSummaryUIStateFactory$getBookingDetailsState$1.L$0 = str10;
                    productSummaryUIStateFactory$getBookingDetailsState$1.L$1 = chaloTextUIState;
                    productSummaryUIStateFactory$getBookingDetailsState$1.L$2 = titleSubtitleUiState2;
                    productSummaryUIStateFactory$getBookingDetailsState$1.L$3 = titleSubtitleUiState3;
                    productSummaryUIStateFactory$getBookingDetailsState$1.L$4 = chaloTextStyleHelper5;
                    productSummaryUIStateFactory$getBookingDetailsState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.PAYMENT_MODE, new Object[0], productSummaryUIStateFactory$getBookingDetailsState$1);
                    if (objB2 != coroutineSingletons) {
                        titleSubtitleUiState6 = titleSubtitleUiState2;
                        chaloTextUIState3 = chaloTextUIState;
                        str11 = str10;
                        chaloTextStyleHelper4 = chaloTextStyleHelper5;
                        titleSubtitleUiState5 = titleSubtitleUiState6;
                        chaloTextUIState2 = chaloTextUIState3;
                        titleSubtitleUiState4 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), str11 != null ? ChaloTextStyleHelper.c(chaloTextStyleHelper5, str11, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT) : null, null, 9);
                    }
                } else {
                    titleSubtitleUiState4 = null;
                    titleSubtitleUiState5 = titleSubtitleUiState2;
                    chaloTextUIState2 = chaloTextUIState;
                }
                return new BookingDetailsUIState(chaloTextUIState2, titleSubtitleUiState5, titleSubtitleUiState3, null, titleSubtitleUiState4, null, null, 104);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0472  */
    /* JADX WARN: Code duplicated, block: B:35:0x0478  */
    /* JADX WARN: Code duplicated, block: B:38:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x051f  */
    /* JADX WARN: Code duplicated, block: B:43:0x055a  */
    /* JADX WARN: Code duplicated, block: B:45:0x059c  */
    /* JADX WARN: Code duplicated, block: B:46:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:49:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0647  */
    /* JADX WARN: Code duplicated, block: B:54:0x0681  */
    /* JADX WARN: Code duplicated, block: B:56:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x071c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0783  */
    /* JADX WARN: Code duplicated, block: B:67:0x0790  */
    /* JADX WARN: Code duplicated, block: B:69:0x0797  */
    /* JADX WARN: Code duplicated, block: B:73:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x0813  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0877  */
    /* JADX WARN: Code duplicated, block: B:84:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:86:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0925  */
    /* JADX WARN: Code duplicated, block: B:93:0x0928  */
    /* JADX WARN: Code duplicated, block: B:97:0x0986  */
    /* JADX WARN: Code duplicated, block: B:99:0x09d1  */
    public final Object c(ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking, ProductReceiptData productReceiptData, boolean z, long j, String str, wl1 wl1Var, wl1 wl1Var2, wl1 wl1Var3, ContinuationImpl continuationImpl) {
        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
        Function1 function1;
        Function1 function2;
        ProductReceiptData productReceiptData2;
        Object obj;
        long j2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        Function1 function3;
        ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking2;
        boolean z2;
        String str2;
        ChaloColorToken.AlmostBlackColor almostBlackColor;
        ToolbarUIState toolbarUIState;
        int i;
        ChaloColorToken.RedBase redBase;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        ChaloColorToken.GreenBase greenBase;
        StringProvider stringProvider;
        String str3;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        long j3;
        BusTicketStatusSpec busTicketStatusSpec;
        ChaloColorToken.AmountAddedText amountAddedText;
        Object objB;
        CoroutineSingletons coroutineSingletons;
        String str4;
        ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking3;
        Object obj2;
        Function1 function4;
        ToolbarUIState toolbarUIState2;
        Function1 function5;
        BusTicketStatusSpec busTicketStatusSpec2;
        Function1 function6;
        long j4;
        String str5;
        long j5;
        BusTicketStatusSpec busTicketStatusSpec3;
        Object objB2;
        String str6;
        ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking4;
        Object obj3;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        BusTicketStatusSpec busTicketStatusSpec4;
        long j6;
        StringProvider stringProvider2;
        String str7;
        long j7;
        BusTicketStatusSpec busTicketStatusSpec5;
        Object objB3;
        CoroutineSingletons coroutineSingletons2;
        String str8;
        ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking5;
        Object obj4;
        Function1 function10;
        ToolbarUIState toolbarUIState3;
        Function1 function11;
        BusTicketStatusSpec busTicketStatusSpec6;
        long j8;
        ToolbarUIState toolbarUIState4;
        long j9;
        String str9;
        Function1 function12;
        BusTicketStatusUiState busTicketStatusUiState;
        String str10;
        long j10;
        BusTicketStatusSpec busTicketStatusSpec7;
        ChaloColorToken.AmountAddedText amountAddedText2;
        StringProvider stringProvider3;
        Object objB4;
        String str11;
        ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking6;
        Function1 function13;
        ToolbarUIState toolbarUIState5;
        Object obj5;
        Function1 function14;
        BusTicketStatusSpec busTicketStatusSpec8;
        Function1 function15;
        long j11;
        BusTicketStatusSpec busTicketStatusSpec9;
        String str12;
        long j12;
        Object objB5;
        ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking7;
        Object obj6;
        Function1 function16;
        ToolbarUIState toolbarUIState6;
        Function1 function17;
        Function1 function18;
        long j13;
        String str13;
        BusTicketStatusSpec busTicketStatusSpec10;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState;
        ProductSummaryUIStateFactory productSummaryUIStateFactory;
        Object objD;
        String str14;
        ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking8;
        Object obj7;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState2;
        ProductReceiptData productReceiptData3;
        List list;
        String strR;
        StringProvider stringProvider4;
        long j14;
        Object objB6;
        Function1 function19;
        List list2;
        Object obj8;
        BookingDetailsUIState bookingDetailsUIState;
        long j15;
        String strA;
        List list3;
        StringProvider stringProvider5;
        Object objB7;
        BookingDetailsUIState bookingDetailsUIState2;
        Object obj9;
        String str15;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState3;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        long j16;
        List list4;
        TextUIState.ChaloTextUIState chaloTextUIStateF;
        long j17;
        BookingDetailsUIState bookingDetailsUIState3;
        StringProvider stringProvider6;
        Object objB8;
        CoroutineSingletons coroutineSingletons3;
        Object obj10;
        boolean z3;
        BookingDetailsUIState bookingDetailsUIState4;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        List list5;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState4;
        long j18;
        ChaloTextStyleHelper chaloTextStyleHelper6;
        CoroutineSingletons coroutineSingletons4;
        StringProvider stringProvider7;
        PriceDetailsUIState priceDetailsUIState;
        long j19;
        long j20;
        TicketSupportUIState ticketSupportUIState;
        long j21;
        StringProvider stringProvider8;
        Object objB9;
        CoroutineSingletons coroutineSingletons5;
        PriceDetailsUIState priceDetailsUIState2;
        Object obj11;
        ChaloTextStyleHelper chaloTextStyleHelper7;
        TextUIState.ChaloTextUIState chaloTextUIStateC;
        BookingDetailsUIState bookingDetailsUIState5;
        Object objB10;
        BookingDetailsUIState bookingDetailsUIState6;
        PriceDetailsUIState priceDetailsUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object obj12;
        long j22;
        ChaloTextStyleHelper chaloTextStyleHelper8;
        List list6;
        ChaloTextStyleHelper chaloTextStyleHelper9;
        ProductSummaryStatusUiData productSummaryStatusUiData;
        Object objA;
        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2;
        PriceDetailsUIState priceDetailsUIState4;
        BookingDetailsUIState bookingDetailsUIState7;
        List list7;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState5;
        TicketSupportUIState ticketSupportUIState2;
        TicketInfoUIState ticketInfoUIState;
        TicketInfoUIState ticketInfoUIState2;
        PriceDetailsUIState priceDetailsUIState5;
        ProductSummaryStatusUiData productSummaryStatusUiData2;
        ImageUIState imageUIState;
        PriceDetailsUIState priceDetailsUIState6;
        ChaloColorToken chaloColorToken;
        ChaloTextStyleHelper chaloTextStyleHelper10;
        TicketInfoUIState ticketInfoUIState3;
        if (continuationImpl instanceof ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1) {
            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 = (ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1) continuationImpl;
            int i2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 = new ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1(this, continuationImpl);
            }
        } else {
            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 = new ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1(this, continuationImpl);
        }
        Object obj13 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.result;
        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label;
        ChaloColorToken.DarkRed darkRed = ChaloColorToken.DarkRed.f9786a;
        ChaloColorToken.AmountAddedText amountAddedText3 = ChaloColorToken.AmountAddedText.f9758a;
        ChaloColorToken.AlmostBlackColor almostBlackColor2 = ChaloColorToken.AlmostBlackColor.f9756a;
        ChaloTextStyleHelper chaloTextStyleHelper11 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider9 = this.b;
        switch (i3) {
            case 0:
                ResultKt.b(obj13);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str;
                function1 = wl1Var;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                function2 = wl1Var2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = wl1Var3;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = chaloTextStyleHelper11;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 1;
                Object objB11 = stringProvider9.b(StringEnum.RIDE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                if (objB11 != coroutineSingletons6) {
                    productReceiptData2 = productReceiptData;
                    obj = objB11;
                    j2 = j;
                    chaloTextStyleHelper = chaloTextStyleHelper11;
                    function3 = wl1Var3;
                    metroTicketBooking2 = metroTicketBooking;
                    z2 = z;
                    str2 = str;
                    almostBlackColor = almostBlackColor2;
                    toolbarUIState = new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) obj, almostBlackColor2, null, null, null, 124), null, null, null, 0.0f, null, null, 253);
                    i = WhenMappings.f8789a[metroTicketBooking2.d.e.ordinal()];
                    redBase = ChaloColorToken.RedBase.f9846a;
                    chaloTextStyleHelper2 = chaloTextStyleHelper11;
                    greenBase = ChaloColorToken.GreenBase.f9800a;
                    switch (i) {
                        case 1:
                            stringProvider = stringProvider9;
                            str3 = str2;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            j3 = j2;
                            amountAddedText = amountAddedText3;
                            busTicketStatusSpec = new BusTicketStatusSpec(greenBase, 11);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = function3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = toolbarUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = busTicketStatusSpec;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 2;
                            objB = stringProvider.b(StringEnum.ACTIVE, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons = coroutineSingletons6;
                            if (objB != coroutineSingletons) {
                                str4 = str3;
                                metroTicketBooking3 = metroTicketBooking2;
                                obj2 = objB;
                                function4 = function3;
                                toolbarUIState2 = toolbarUIState;
                                function5 = function1;
                                busTicketStatusSpec2 = busTicketStatusSpec;
                                function6 = function2;
                                j4 = j3;
                                busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec2, new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.TitleLarge, amountAddedText, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
                                metroTicketBooking2 = metroTicketBooking3;
                                toolbarUIState4 = toolbarUIState2;
                                function12 = function6;
                                function1 = function5;
                                str9 = str4;
                                j9 = j4;
                                function3 = function4;
                                toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                                productSummaryUIStateFactory = this;
                                objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                if (objD != coroutineSingletons) {
                                    str14 = str9;
                                    metroTicketBooking8 = metroTicketBooking2;
                                    obj7 = objD;
                                    toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                                    productReceiptData3 = productReceiptData2;
                                    list = (List) obj7;
                                    String str16 = metroTicketBooking8.d.f5431a;
                                    if (productReceiptData3 != null) {
                                        strR = productReceiptData3.r();
                                    } else {
                                        strR = null;
                                    }
                                    stringProvider4 = stringProvider;
                                    String strA2 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    j14 = j9;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                                    objB6 = productSummaryUIStateFactory.b(str16, strR, strA2, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    coroutineSingletons = coroutineSingletons;
                                    if (objB6 != coroutineSingletons) {
                                        function19 = function12;
                                        list2 = list;
                                        obj8 = objB6;
                                        bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                        j15 = j14;
                                        strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                        chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                        list3 = list2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                        stringProvider5 = stringProvider4;
                                        objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        if (objB7 != coroutineSingletons) {
                                            bookingDetailsUIState2 = bookingDetailsUIState;
                                            obj9 = objB7;
                                            str15 = strA;
                                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                            chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                            j16 = j15;
                                            list4 = list3;
                                            CoroutineSingletons coroutineSingletons7 = coroutineSingletons;
                                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                            j17 = j16;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                            bookingDetailsUIState3 = bookingDetailsUIState2;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                            stringProvider6 = stringProvider5;
                                            objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                            coroutineSingletons3 = coroutineSingletons7;
                                            if (objB8 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            obj10 = objB8;
                                            z3 = z2;
                                            bookingDetailsUIState4 = bookingDetailsUIState3;
                                            chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                            list5 = list4;
                                            toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                            j18 = j17;
                                            UIFontWeight uIFontWeight = UIFontWeight.SemiBold;
                                            TextUIState.ChaloTextUIState chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                            ChaloTextStyleHelper chaloTextStyleHelper12 = chaloTextStyleHelper11;
                                            TextUIState.ChaloTextUIState chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper12, str15, null, null, uIFontWeight, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                            chaloTextStyleHelper6 = chaloTextStyleHelper12;
                                            coroutineSingletons4 = coroutineSingletons3;
                                            stringProvider7 = stringProvider6;
                                            j19 = j18;
                                            priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC2, chaloTextUIStateC3, null, 9), EmptyList.f17557a, null);
                                            if (z3) {
                                                switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                                    case 1:
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                        j21 = j19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                        stringProvider8 = stringProvider7;
                                                        objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                        coroutineSingletons5 = coroutineSingletons4;
                                                        if (objB9 == coroutineSingletons5) {
                                                            return coroutineSingletons5;
                                                        }
                                                        priceDetailsUIState2 = priceDetailsUIState;
                                                        obj11 = objB9;
                                                        chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                        CoroutineSingletons coroutineSingletons8 = coroutineSingletons5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                        bookingDetailsUIState5 = bookingDetailsUIState4;
                                                        stringProvider7 = stringProvider8;
                                                        objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                        coroutineSingletons4 = coroutineSingletons8;
                                                        if (objB10 == coroutineSingletons4) {
                                                            return coroutineSingletons4;
                                                        }
                                                        bookingDetailsUIState6 = bookingDetailsUIState5;
                                                        priceDetailsUIState3 = priceDetailsUIState2;
                                                        List list8 = list5;
                                                        chaloTextUIState = chaloTextUIStateC;
                                                        obj12 = objB10;
                                                        j22 = j21;
                                                        chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                        list6 = list8;
                                                        TicketSupportUIState ticketSupportUIState3 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                        list5 = list6;
                                                        str14 = str14;
                                                        priceDetailsUIState = priceDetailsUIState3;
                                                        j20 = j22;
                                                        ticketSupportUIState = ticketSupportUIState3;
                                                        bookingDetailsUIState4 = bookingDetailsUIState6;
                                                        MetroTicketAppModel metroTicketAppModel = metroTicketBooking8.d;
                                                        String str17 = str14;
                                                        Map map = metroTicketAppModel.l;
                                                        Function1 function20 = function1;
                                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                        long j23 = metroTicketAppModel.k;
                                                        boolean z4 = !metroTicketAppModel.h(j20);
                                                        Long l = new Long(j23);
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                        productSummaryStatusUiData = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$3 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                        objA = a(productReceiptData3, metroTicketBooking8, map, str17, l, EmptyList.f17557a, z4, function20, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$3);
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$3;
                                                        if (objA == coroutineSingletons4) {
                                                            return coroutineSingletons4;
                                                        }
                                                        priceDetailsUIState4 = priceDetailsUIState;
                                                        obj13 = objA;
                                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                                        list7 = list5;
                                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                        ticketSupportUIState2 = ticketSupportUIState;
                                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                                        if (productReceiptData3 == null || metroTicketBooking8.d.e == MetroTicketStatus.ACTIVE) {
                                                            ticketInfoUIState2 = ticketInfoUIState;
                                                            priceDetailsUIState5 = priceDetailsUIState4;
                                                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                        } else {
                                                            ImageUIState imageUIState2 = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2.L$0 = toolBarWithRightComponentUIState5;
                                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2.L$1 = list7;
                                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2.L$2 = bookingDetailsUIState7;
                                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2.L$3 = priceDetailsUIState4;
                                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2.L$4 = ticketSupportUIState2;
                                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2.L$5 = ticketInfoUIState;
                                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2.L$6 = imageUIState2;
                                                            ChaloColorToken.SectionDividerColor sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2.L$7 = sectionDividerColor;
                                                            ChaloTextStyleHelper chaloTextStyleHelper13 = chaloTextStyleHelper9;
                                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2.L$8 = chaloTextStyleHelper13;
                                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2.label = 14;
                                                            Object objB12 = stringProvider7.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2);
                                                            if (objB12 == coroutineSingletons4) {
                                                                return coroutineSingletons4;
                                                            }
                                                            imageUIState = imageUIState2;
                                                            priceDetailsUIState6 = priceDetailsUIState4;
                                                            chaloColorToken = sectionDividerColor;
                                                            chaloTextStyleHelper10 = chaloTextStyleHelper13;
                                                            ticketInfoUIState3 = ticketInfoUIState;
                                                            obj13 = objB12;
                                                            ticketInfoUIState2 = ticketInfoUIState3;
                                                            priceDetailsUIState5 = priceDetailsUIState6;
                                                            productSummaryStatusUiData2 = new ProductSummaryStatusUiData(imageUIState, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper10, (String) obj13, almostBlackColor, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                                        }
                                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        j20 = j19;
                                                        break;
                                                    default:
                                                        throw new NoWhenBranchMatchedException();
                                                }
                                            } else {
                                                j20 = j19;
                                            }
                                            ticketSupportUIState = null;
                                            MetroTicketAppModel metroTicketAppModel2 = metroTicketBooking8.d;
                                            String str18 = str14;
                                            Map map2 = metroTicketAppModel2.l;
                                            Function1 function21 = function1;
                                            chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                            long j24 = metroTicketAppModel2.k;
                                            boolean z5 = !metroTicketAppModel2.h(j20);
                                            Long l2 = new Long(j24);
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                            productSummaryStatusUiData = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                            ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$4 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                            objA = a(productReceiptData3, metroTicketBooking8, map2, str18, l2, EmptyList.f17557a, z5, function21, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$4);
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$4;
                                            if (objA == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            priceDetailsUIState4 = priceDetailsUIState;
                                            obj13 = objA;
                                            bookingDetailsUIState7 = bookingDetailsUIState4;
                                            list7 = list5;
                                            toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                            ticketSupportUIState2 = ticketSupportUIState;
                                            ticketInfoUIState = (TicketInfoUIState) obj13;
                                            if (productReceiptData3 == null) {
                                            }
                                            ticketInfoUIState2 = ticketInfoUIState;
                                            priceDetailsUIState5 = priceDetailsUIState4;
                                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 2:
                        case 3:
                            str5 = str2;
                            j5 = j2;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            busTicketStatusSpec3 = new BusTicketStatusSpec(greenBase, 11);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = function3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = toolbarUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = busTicketStatusSpec3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 3;
                            objB2 = stringProvider9.b(StringEnum.COMPLETED, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons = coroutineSingletons6;
                            if (objB2 != coroutineSingletons) {
                                str6 = str5;
                                metroTicketBooking4 = metroTicketBooking2;
                                obj3 = objB2;
                                function7 = function3;
                                function8 = function1;
                                function9 = function2;
                                busTicketStatusSpec4 = busTicketStatusSpec3;
                                j6 = j5;
                                busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec4, new TextUIState.ChaloTextUIState((String) obj3, UITextStyle.TitleLarge, amountAddedText3, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_GREEN_TICK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                                metroTicketBooking2 = metroTicketBooking4;
                                function3 = function7;
                                function12 = function9;
                                function1 = function8;
                                str9 = str6;
                                toolbarUIState4 = toolbarUIState;
                                j9 = j6;
                                stringProvider = stringProvider9;
                                toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                                productSummaryUIStateFactory = this;
                                objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                if (objD != coroutineSingletons) {
                                    str14 = str9;
                                    metroTicketBooking8 = metroTicketBooking2;
                                    obj7 = objD;
                                    toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                                    productReceiptData3 = productReceiptData2;
                                    list = (List) obj7;
                                    String str19 = metroTicketBooking8.d.f5431a;
                                    if (productReceiptData3 != null) {
                                        strR = productReceiptData3.r();
                                    } else {
                                        strR = null;
                                    }
                                    stringProvider4 = stringProvider;
                                    String strA3 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    j14 = j9;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                                    objB6 = productSummaryUIStateFactory.b(str19, strR, strA3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    coroutineSingletons = coroutineSingletons;
                                    if (objB6 != coroutineSingletons) {
                                        function19 = function12;
                                        list2 = list;
                                        obj8 = objB6;
                                        bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                        j15 = j14;
                                        strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                        chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                        list3 = list2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                        stringProvider5 = stringProvider4;
                                        objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        if (objB7 != coroutineSingletons) {
                                            bookingDetailsUIState2 = bookingDetailsUIState;
                                            obj9 = objB7;
                                            str15 = strA;
                                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                            chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                            j16 = j15;
                                            list4 = list3;
                                            CoroutineSingletons coroutineSingletons9 = coroutineSingletons;
                                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                            j17 = j16;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                            bookingDetailsUIState3 = bookingDetailsUIState2;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                            stringProvider6 = stringProvider5;
                                            objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                            coroutineSingletons3 = coroutineSingletons9;
                                            if (objB8 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            obj10 = objB8;
                                            z3 = z2;
                                            bookingDetailsUIState4 = bookingDetailsUIState3;
                                            chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                            list5 = list4;
                                            toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                            j18 = j17;
                                            UIFontWeight uIFontWeight2 = UIFontWeight.SemiBold;
                                            TextUIState.ChaloTextUIState chaloTextUIStateC4 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight2, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                            ChaloTextStyleHelper chaloTextStyleHelper14 = chaloTextStyleHelper11;
                                            TextUIState.ChaloTextUIState chaloTextUIStateC5 = ChaloTextStyleHelper.c(chaloTextStyleHelper14, str15, null, null, uIFontWeight2, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                            chaloTextStyleHelper6 = chaloTextStyleHelper14;
                                            coroutineSingletons4 = coroutineSingletons3;
                                            stringProvider7 = stringProvider6;
                                            j19 = j18;
                                            priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC4, chaloTextUIStateC5, null, 9), EmptyList.f17557a, null);
                                            if (z3) {
                                                switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                                    case 1:
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                        j21 = j19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                        stringProvider8 = stringProvider7;
                                                        objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                        coroutineSingletons5 = coroutineSingletons4;
                                                        if (objB9 == coroutineSingletons5) {
                                                            return coroutineSingletons5;
                                                        }
                                                        priceDetailsUIState2 = priceDetailsUIState;
                                                        obj11 = objB9;
                                                        chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                        CoroutineSingletons coroutineSingletons10 = coroutineSingletons5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                        bookingDetailsUIState5 = bookingDetailsUIState4;
                                                        stringProvider7 = stringProvider8;
                                                        objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                        coroutineSingletons4 = coroutineSingletons10;
                                                        if (objB10 == coroutineSingletons4) {
                                                            return coroutineSingletons4;
                                                        }
                                                        bookingDetailsUIState6 = bookingDetailsUIState5;
                                                        priceDetailsUIState3 = priceDetailsUIState2;
                                                        List list9 = list5;
                                                        chaloTextUIState = chaloTextUIStateC;
                                                        obj12 = objB10;
                                                        j22 = j21;
                                                        chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                        list6 = list9;
                                                        TicketSupportUIState ticketSupportUIState4 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                        list5 = list6;
                                                        str14 = str14;
                                                        priceDetailsUIState = priceDetailsUIState3;
                                                        j20 = j22;
                                                        ticketSupportUIState = ticketSupportUIState4;
                                                        bookingDetailsUIState4 = bookingDetailsUIState6;
                                                        MetroTicketAppModel metroTicketAppModel3 = metroTicketBooking8.d;
                                                        String str110 = str14;
                                                        Map map3 = metroTicketAppModel3.l;
                                                        Function1 function22 = function1;
                                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                        long j25 = metroTicketAppModel3.k;
                                                        boolean z6 = !metroTicketAppModel3.h(j20);
                                                        Long l3 = new Long(j25);
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                        productSummaryStatusUiData = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$5 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                        objA = a(productReceiptData3, metroTicketBooking8, map3, str110, l3, EmptyList.f17557a, z6, function22, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$5);
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$5;
                                                        if (objA == coroutineSingletons4) {
                                                            return coroutineSingletons4;
                                                        }
                                                        priceDetailsUIState4 = priceDetailsUIState;
                                                        obj13 = objA;
                                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                                        list7 = list5;
                                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                        ticketSupportUIState2 = ticketSupportUIState;
                                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                                        if (productReceiptData3 == null) {
                                                            break;
                                                        }
                                                        ticketInfoUIState2 = ticketInfoUIState;
                                                        priceDetailsUIState5 = priceDetailsUIState4;
                                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        j20 = j19;
                                                        break;
                                                    default:
                                                        throw new NoWhenBranchMatchedException();
                                                }
                                            } else {
                                                j20 = j19;
                                            }
                                            ticketSupportUIState = null;
                                            MetroTicketAppModel metroTicketAppModel4 = metroTicketBooking8.d;
                                            String str111 = str14;
                                            Map map4 = metroTicketAppModel4.l;
                                            Function1 function23 = function1;
                                            chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                            long j26 = metroTicketAppModel4.k;
                                            boolean z7 = !metroTicketAppModel4.h(j20);
                                            Long l4 = new Long(j26);
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                            productSummaryStatusUiData = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                            ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$6 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                            objA = a(productReceiptData3, metroTicketBooking8, map4, str111, l4, EmptyList.f17557a, z7, function23, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$6);
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$6;
                                            if (objA == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            priceDetailsUIState4 = priceDetailsUIState;
                                            obj13 = objA;
                                            bookingDetailsUIState7 = bookingDetailsUIState4;
                                            list7 = list5;
                                            toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                            ticketSupportUIState2 = ticketSupportUIState;
                                            ticketInfoUIState = (TicketInfoUIState) obj13;
                                            if (productReceiptData3 == null) {
                                                break;
                                            }
                                            ticketInfoUIState2 = ticketInfoUIState;
                                            priceDetailsUIState5 = priceDetailsUIState4;
                                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 4:
                            stringProvider2 = stringProvider9;
                            str7 = str2;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            j7 = j2;
                            busTicketStatusSpec5 = new BusTicketStatusSpec(redBase, 11);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str7;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = function3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = toolbarUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = busTicketStatusSpec5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j7;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 4;
                            objB3 = stringProvider2.b(StringEnum.EXPIRED, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons2 = coroutineSingletons6;
                            if (objB3 == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            str8 = str7;
                            metroTicketBooking5 = metroTicketBooking2;
                            obj4 = objB3;
                            function10 = function3;
                            toolbarUIState3 = toolbarUIState;
                            function11 = function1;
                            busTicketStatusSpec6 = busTicketStatusSpec5;
                            j8 = j7;
                            Function1 function24 = function2;
                            busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec6, new TextUIState.ChaloTextUIState((String) obj4, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                            coroutineSingletons = coroutineSingletons2;
                            j9 = j8;
                            toolbarUIState4 = toolbarUIState3;
                            function3 = function10;
                            function1 = function11;
                            str9 = str8;
                            stringProvider = stringProvider2;
                            metroTicketBooking2 = metroTicketBooking5;
                            function12 = function24;
                            toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                            productSummaryUIStateFactory = this;
                            objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            if (objD != coroutineSingletons) {
                                str14 = str9;
                                metroTicketBooking8 = metroTicketBooking2;
                                obj7 = objD;
                                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                                productReceiptData3 = productReceiptData2;
                                list = (List) obj7;
                                String str112 = metroTicketBooking8.d.f5431a;
                                if (productReceiptData3 != null) {
                                    strR = productReceiptData3.r();
                                } else {
                                    strR = null;
                                }
                                stringProvider4 = stringProvider;
                                String strA4 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                j14 = j9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                                objB6 = productSummaryUIStateFactory.b(str112, strR, strA4, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                coroutineSingletons = coroutineSingletons;
                                if (objB6 != coroutineSingletons) {
                                    function19 = function12;
                                    list2 = list;
                                    obj8 = objB6;
                                    bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                    j15 = j14;
                                    strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                    chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    list3 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                    stringProvider5 = stringProvider4;
                                    objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    if (objB7 != coroutineSingletons) {
                                        bookingDetailsUIState2 = bookingDetailsUIState;
                                        obj9 = objB7;
                                        str15 = strA;
                                        toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                        j16 = j15;
                                        list4 = list3;
                                        CoroutineSingletons coroutineSingletons11 = coroutineSingletons;
                                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                        j17 = j16;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                        bookingDetailsUIState3 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                        stringProvider6 = stringProvider5;
                                        objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons3 = coroutineSingletons11;
                                        if (objB8 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        obj10 = objB8;
                                        z3 = z2;
                                        bookingDetailsUIState4 = bookingDetailsUIState3;
                                        chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                        list5 = list4;
                                        toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                        j18 = j17;
                                        UIFontWeight uIFontWeight3 = UIFontWeight.SemiBold;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC6 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight3, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        ChaloTextStyleHelper chaloTextStyleHelper15 = chaloTextStyleHelper11;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC7 = ChaloTextStyleHelper.c(chaloTextStyleHelper15, str15, null, null, uIFontWeight3, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        chaloTextStyleHelper6 = chaloTextStyleHelper15;
                                        coroutineSingletons4 = coroutineSingletons3;
                                        stringProvider7 = stringProvider6;
                                        j19 = j18;
                                        priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC6, chaloTextUIStateC7, null, 9), EmptyList.f17557a, null);
                                        if (z3) {
                                            switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                                case 1:
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    j21 = j19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                    stringProvider8 = stringProvider7;
                                                    objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons5 = coroutineSingletons4;
                                                    if (objB9 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    priceDetailsUIState2 = priceDetailsUIState;
                                                    obj11 = objB9;
                                                    chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                    CoroutineSingletons coroutineSingletons12 = coroutineSingletons5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                    bookingDetailsUIState5 = bookingDetailsUIState4;
                                                    stringProvider7 = stringProvider8;
                                                    objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons4 = coroutineSingletons12;
                                                    if (objB10 == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    bookingDetailsUIState6 = bookingDetailsUIState5;
                                                    priceDetailsUIState3 = priceDetailsUIState2;
                                                    List list10 = list5;
                                                    chaloTextUIState = chaloTextUIStateC;
                                                    obj12 = objB10;
                                                    j22 = j21;
                                                    chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                    list6 = list10;
                                                    TicketSupportUIState ticketSupportUIState5 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                    list5 = list6;
                                                    str14 = str14;
                                                    priceDetailsUIState = priceDetailsUIState3;
                                                    j20 = j22;
                                                    ticketSupportUIState = ticketSupportUIState5;
                                                    bookingDetailsUIState4 = bookingDetailsUIState6;
                                                    MetroTicketAppModel metroTicketAppModel5 = metroTicketBooking8.d;
                                                    String str113 = str14;
                                                    Map map5 = metroTicketAppModel5.l;
                                                    Function1 function25 = function1;
                                                    chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                    long j27 = metroTicketAppModel5.k;
                                                    boolean z8 = !metroTicketAppModel5.h(j20);
                                                    Long l5 = new Long(j27);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                    productSummaryStatusUiData = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                    ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$7 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                    objA = a(productReceiptData3, metroTicketBooking8, map5, str113, l5, EmptyList.f17557a, z8, function25, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$7);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$7;
                                                    if (objA == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    priceDetailsUIState4 = priceDetailsUIState;
                                                    obj13 = objA;
                                                    bookingDetailsUIState7 = bookingDetailsUIState4;
                                                    list7 = list5;
                                                    toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                    ticketSupportUIState2 = ticketSupportUIState;
                                                    ticketInfoUIState = (TicketInfoUIState) obj13;
                                                    if (productReceiptData3 == null) {
                                                        break;
                                                    }
                                                    ticketInfoUIState2 = ticketInfoUIState;
                                                    priceDetailsUIState5 = priceDetailsUIState4;
                                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    j20 = j19;
                                                    break;
                                                default:
                                                    throw new NoWhenBranchMatchedException();
                                            }
                                        } else {
                                            j20 = j19;
                                        }
                                        ticketSupportUIState = null;
                                        MetroTicketAppModel metroTicketAppModel6 = metroTicketBooking8.d;
                                        String str114 = str14;
                                        Map map6 = metroTicketAppModel6.l;
                                        Function1 function26 = function1;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                        long j28 = metroTicketAppModel6.k;
                                        boolean z9 = !metroTicketAppModel6.h(j20);
                                        Long l6 = new Long(j28);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                        productSummaryStatusUiData = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$8 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                        objA = a(productReceiptData3, metroTicketBooking8, map6, str114, l6, EmptyList.f17557a, z9, function26, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$8);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$8;
                                        if (objA == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        priceDetailsUIState4 = priceDetailsUIState;
                                        obj13 = objA;
                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                        list7 = list5;
                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                        ticketSupportUIState2 = ticketSupportUIState;
                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                        if (productReceiptData3 == null) {
                                            break;
                                        }
                                        ticketInfoUIState2 = ticketInfoUIState;
                                        priceDetailsUIState5 = priceDetailsUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 5:
                        case 6:
                        case 7:
                            coroutineSingletons = coroutineSingletons6;
                            stringProvider = stringProvider9;
                            toolbarUIState4 = toolbarUIState;
                            j9 = j2;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            str9 = str2;
                            function12 = function2;
                            busTicketStatusUiState = null;
                            toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                            productSummaryUIStateFactory = this;
                            objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            if (objD != coroutineSingletons) {
                                str14 = str9;
                                metroTicketBooking8 = metroTicketBooking2;
                                obj7 = objD;
                                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                                productReceiptData3 = productReceiptData2;
                                list = (List) obj7;
                                String str115 = metroTicketBooking8.d.f5431a;
                                if (productReceiptData3 != null) {
                                    strR = productReceiptData3.r();
                                } else {
                                    strR = null;
                                }
                                stringProvider4 = stringProvider;
                                String strA5 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                j14 = j9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                                objB6 = productSummaryUIStateFactory.b(str115, strR, strA5, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                coroutineSingletons = coroutineSingletons;
                                if (objB6 != coroutineSingletons) {
                                    function19 = function12;
                                    list2 = list;
                                    obj8 = objB6;
                                    bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                    j15 = j14;
                                    strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                    chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    list3 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                    stringProvider5 = stringProvider4;
                                    objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    if (objB7 != coroutineSingletons) {
                                        bookingDetailsUIState2 = bookingDetailsUIState;
                                        obj9 = objB7;
                                        str15 = strA;
                                        toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                        j16 = j15;
                                        list4 = list3;
                                        CoroutineSingletons coroutineSingletons13 = coroutineSingletons;
                                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                        j17 = j16;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                        bookingDetailsUIState3 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                        stringProvider6 = stringProvider5;
                                        objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons3 = coroutineSingletons13;
                                        if (objB8 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        obj10 = objB8;
                                        z3 = z2;
                                        bookingDetailsUIState4 = bookingDetailsUIState3;
                                        chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                        list5 = list4;
                                        toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                        j18 = j17;
                                        UIFontWeight uIFontWeight4 = UIFontWeight.SemiBold;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC8 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight4, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        ChaloTextStyleHelper chaloTextStyleHelper16 = chaloTextStyleHelper11;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC9 = ChaloTextStyleHelper.c(chaloTextStyleHelper16, str15, null, null, uIFontWeight4, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        chaloTextStyleHelper6 = chaloTextStyleHelper16;
                                        coroutineSingletons4 = coroutineSingletons3;
                                        stringProvider7 = stringProvider6;
                                        j19 = j18;
                                        priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC8, chaloTextUIStateC9, null, 9), EmptyList.f17557a, null);
                                        if (z3) {
                                            switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                                case 1:
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    j21 = j19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                    stringProvider8 = stringProvider7;
                                                    objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons5 = coroutineSingletons4;
                                                    if (objB9 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    priceDetailsUIState2 = priceDetailsUIState;
                                                    obj11 = objB9;
                                                    chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                    CoroutineSingletons coroutineSingletons14 = coroutineSingletons5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                    bookingDetailsUIState5 = bookingDetailsUIState4;
                                                    stringProvider7 = stringProvider8;
                                                    objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons4 = coroutineSingletons14;
                                                    if (objB10 == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    bookingDetailsUIState6 = bookingDetailsUIState5;
                                                    priceDetailsUIState3 = priceDetailsUIState2;
                                                    List list11 = list5;
                                                    chaloTextUIState = chaloTextUIStateC;
                                                    obj12 = objB10;
                                                    j22 = j21;
                                                    chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                    list6 = list11;
                                                    TicketSupportUIState ticketSupportUIState6 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                    list5 = list6;
                                                    str14 = str14;
                                                    priceDetailsUIState = priceDetailsUIState3;
                                                    j20 = j22;
                                                    ticketSupportUIState = ticketSupportUIState6;
                                                    bookingDetailsUIState4 = bookingDetailsUIState6;
                                                    MetroTicketAppModel metroTicketAppModel7 = metroTicketBooking8.d;
                                                    String str116 = str14;
                                                    Map map7 = metroTicketAppModel7.l;
                                                    Function1 function27 = function1;
                                                    chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                    long j29 = metroTicketAppModel7.k;
                                                    boolean z10 = !metroTicketAppModel7.h(j20);
                                                    Long l7 = new Long(j29);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                    productSummaryStatusUiData = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                    ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$9 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                    objA = a(productReceiptData3, metroTicketBooking8, map7, str116, l7, EmptyList.f17557a, z10, function27, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$9);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$9;
                                                    if (objA == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    priceDetailsUIState4 = priceDetailsUIState;
                                                    obj13 = objA;
                                                    bookingDetailsUIState7 = bookingDetailsUIState4;
                                                    list7 = list5;
                                                    toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                    ticketSupportUIState2 = ticketSupportUIState;
                                                    ticketInfoUIState = (TicketInfoUIState) obj13;
                                                    if (productReceiptData3 == null) {
                                                        break;
                                                    }
                                                    ticketInfoUIState2 = ticketInfoUIState;
                                                    priceDetailsUIState5 = priceDetailsUIState4;
                                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    j20 = j19;
                                                    break;
                                                default:
                                                    throw new NoWhenBranchMatchedException();
                                            }
                                        } else {
                                            j20 = j19;
                                        }
                                        ticketSupportUIState = null;
                                        MetroTicketAppModel metroTicketAppModel8 = metroTicketBooking8.d;
                                        String str117 = str14;
                                        Map map8 = metroTicketAppModel8.l;
                                        Function1 function28 = function1;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                        long j210 = metroTicketAppModel8.k;
                                        boolean z11 = !metroTicketAppModel8.h(j20);
                                        Long l8 = new Long(j210);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                        productSummaryStatusUiData = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$10 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                        objA = a(productReceiptData3, metroTicketBooking8, map8, str117, l8, EmptyList.f17557a, z11, function28, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$10);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$10;
                                        if (objA == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        priceDetailsUIState4 = priceDetailsUIState;
                                        obj13 = objA;
                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                        list7 = list5;
                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                        ticketSupportUIState2 = ticketSupportUIState;
                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                        if (productReceiptData3 == null) {
                                            break;
                                        }
                                        ticketInfoUIState2 = ticketInfoUIState;
                                        priceDetailsUIState5 = priceDetailsUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 8:
                            str10 = str2;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            j10 = j2;
                            busTicketStatusSpec7 = new BusTicketStatusSpec(greenBase, 11);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str10;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = function3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = toolbarUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = busTicketStatusSpec7;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j10;
                            amountAddedText2 = amountAddedText3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 5;
                            stringProvider3 = stringProvider9;
                            objB4 = stringProvider3.b(StringEnum.TAPPED_IN, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            if (objB4 != coroutineSingletons6) {
                                str11 = str10;
                                metroTicketBooking6 = metroTicketBooking2;
                                function13 = function3;
                                toolbarUIState5 = toolbarUIState;
                                obj5 = objB4;
                                function14 = function1;
                                busTicketStatusSpec8 = busTicketStatusSpec7;
                                function15 = function2;
                                j11 = j10;
                                busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec8, new TextUIState.ChaloTextUIState((String) obj5, UITextStyle.TitleLarge, amountAddedText2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
                                ToolbarUIState toolbarUIState7 = toolbarUIState5;
                                coroutineSingletons = coroutineSingletons6;
                                stringProvider = stringProvider3;
                                toolbarUIState4 = toolbarUIState7;
                                metroTicketBooking2 = metroTicketBooking6;
                                j9 = j11;
                                function3 = function13;
                                function12 = function15;
                                function1 = function14;
                                str9 = str11;
                                toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                                productSummaryUIStateFactory = this;
                                objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                if (objD != coroutineSingletons) {
                                    str14 = str9;
                                    metroTicketBooking8 = metroTicketBooking2;
                                    obj7 = objD;
                                    toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                                    productReceiptData3 = productReceiptData2;
                                    list = (List) obj7;
                                    String str118 = metroTicketBooking8.d.f5431a;
                                    if (productReceiptData3 != null) {
                                        strR = productReceiptData3.r();
                                    } else {
                                        strR = null;
                                    }
                                    stringProvider4 = stringProvider;
                                    String strA6 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    j14 = j9;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                                    objB6 = productSummaryUIStateFactory.b(str118, strR, strA6, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    coroutineSingletons = coroutineSingletons;
                                    if (objB6 != coroutineSingletons) {
                                        function19 = function12;
                                        list2 = list;
                                        obj8 = objB6;
                                        bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                        j15 = j14;
                                        strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                        chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                        list3 = list2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                        stringProvider5 = stringProvider4;
                                        objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        if (objB7 != coroutineSingletons) {
                                            bookingDetailsUIState2 = bookingDetailsUIState;
                                            obj9 = objB7;
                                            str15 = strA;
                                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                            chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                            j16 = j15;
                                            list4 = list3;
                                            CoroutineSingletons coroutineSingletons15 = coroutineSingletons;
                                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                            j17 = j16;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                            bookingDetailsUIState3 = bookingDetailsUIState2;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                            stringProvider6 = stringProvider5;
                                            objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                            coroutineSingletons3 = coroutineSingletons15;
                                            if (objB8 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            obj10 = objB8;
                                            z3 = z2;
                                            bookingDetailsUIState4 = bookingDetailsUIState3;
                                            chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                            list5 = list4;
                                            toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                            j18 = j17;
                                            UIFontWeight uIFontWeight5 = UIFontWeight.SemiBold;
                                            TextUIState.ChaloTextUIState chaloTextUIStateC10 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight5, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                            ChaloTextStyleHelper chaloTextStyleHelper17 = chaloTextStyleHelper11;
                                            TextUIState.ChaloTextUIState chaloTextUIStateC11 = ChaloTextStyleHelper.c(chaloTextStyleHelper17, str15, null, null, uIFontWeight5, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                            chaloTextStyleHelper6 = chaloTextStyleHelper17;
                                            coroutineSingletons4 = coroutineSingletons3;
                                            stringProvider7 = stringProvider6;
                                            j19 = j18;
                                            priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC10, chaloTextUIStateC11, null, 9), EmptyList.f17557a, null);
                                            if (z3) {
                                                switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                                    case 1:
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                        j21 = j19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                        stringProvider8 = stringProvider7;
                                                        objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                        coroutineSingletons5 = coroutineSingletons4;
                                                        if (objB9 == coroutineSingletons5) {
                                                            return coroutineSingletons5;
                                                        }
                                                        priceDetailsUIState2 = priceDetailsUIState;
                                                        obj11 = objB9;
                                                        chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                        CoroutineSingletons coroutineSingletons16 = coroutineSingletons5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                        bookingDetailsUIState5 = bookingDetailsUIState4;
                                                        stringProvider7 = stringProvider8;
                                                        objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                        coroutineSingletons4 = coroutineSingletons16;
                                                        if (objB10 == coroutineSingletons4) {
                                                            return coroutineSingletons4;
                                                        }
                                                        bookingDetailsUIState6 = bookingDetailsUIState5;
                                                        priceDetailsUIState3 = priceDetailsUIState2;
                                                        List list12 = list5;
                                                        chaloTextUIState = chaloTextUIStateC;
                                                        obj12 = objB10;
                                                        j22 = j21;
                                                        chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                        list6 = list12;
                                                        TicketSupportUIState ticketSupportUIState7 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                        list5 = list6;
                                                        str14 = str14;
                                                        priceDetailsUIState = priceDetailsUIState3;
                                                        j20 = j22;
                                                        ticketSupportUIState = ticketSupportUIState7;
                                                        bookingDetailsUIState4 = bookingDetailsUIState6;
                                                        MetroTicketAppModel metroTicketAppModel9 = metroTicketBooking8.d;
                                                        String str119 = str14;
                                                        Map map9 = metroTicketAppModel9.l;
                                                        Function1 function29 = function1;
                                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                        long j211 = metroTicketAppModel9.k;
                                                        boolean z12 = !metroTicketAppModel9.h(j20);
                                                        Long l9 = new Long(j211);
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                        productSummaryStatusUiData = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                        objA = a(productReceiptData3, metroTicketBooking8, map9, str119, l9, EmptyList.f17557a, z12, function29, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11);
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11;
                                                        if (objA == coroutineSingletons4) {
                                                            return coroutineSingletons4;
                                                        }
                                                        priceDetailsUIState4 = priceDetailsUIState;
                                                        obj13 = objA;
                                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                                        list7 = list5;
                                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                        ticketSupportUIState2 = ticketSupportUIState;
                                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                                        if (productReceiptData3 == null) {
                                                            break;
                                                        }
                                                        ticketInfoUIState2 = ticketInfoUIState;
                                                        priceDetailsUIState5 = priceDetailsUIState4;
                                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        j20 = j19;
                                                        break;
                                                    default:
                                                        throw new NoWhenBranchMatchedException();
                                                }
                                            } else {
                                                j20 = j19;
                                            }
                                            ticketSupportUIState = null;
                                            MetroTicketAppModel metroTicketAppModel10 = metroTicketBooking8.d;
                                            String str1110 = str14;
                                            Map map10 = metroTicketAppModel10.l;
                                            Function1 function210 = function1;
                                            chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                            long j212 = metroTicketAppModel10.k;
                                            boolean z13 = !metroTicketAppModel10.h(j20);
                                            Long l10 = new Long(j212);
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                            productSummaryStatusUiData = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                            ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$12 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                            objA = a(productReceiptData3, metroTicketBooking8, map10, str1110, l10, EmptyList.f17557a, z13, function210, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$12);
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$12;
                                            if (objA == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            priceDetailsUIState4 = priceDetailsUIState;
                                            obj13 = objA;
                                            bookingDetailsUIState7 = bookingDetailsUIState4;
                                            list7 = list5;
                                            toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                            ticketSupportUIState2 = ticketSupportUIState;
                                            ticketInfoUIState = (TicketInfoUIState) obj13;
                                            if (productReceiptData3 == null) {
                                                break;
                                            }
                                            ticketInfoUIState2 = ticketInfoUIState;
                                            priceDetailsUIState5 = priceDetailsUIState4;
                                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                        }
                                    }
                                }
                                return coroutineSingletons;
                            }
                            break;
                        case 9:
                            busTicketStatusSpec9 = new BusTicketStatusSpec(redBase, 11);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = function3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = toolbarUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = busTicketStatusSpec9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            str12 = str2;
                            j12 = j2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j12;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 6;
                            objB5 = stringProvider9.b(StringEnum.CANCELLED, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            if (objB5 != coroutineSingletons6) {
                                metroTicketBooking7 = metroTicketBooking2;
                                obj6 = objB5;
                                function16 = function3;
                                toolbarUIState6 = toolbarUIState;
                                function17 = function1;
                                function18 = function2;
                                j13 = j12;
                                str13 = str12;
                                busTicketStatusSpec10 = busTicketStatusSpec9;
                                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec10, new TextUIState.ChaloTextUIState((String) obj6, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                                coroutineSingletons = coroutineSingletons6;
                                metroTicketBooking2 = metroTicketBooking7;
                                str9 = str13;
                                j9 = j13;
                                toolbarUIState4 = toolbarUIState6;
                                function3 = function16;
                                function12 = function18;
                                function1 = function17;
                                stringProvider = stringProvider9;
                                toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                                productSummaryUIStateFactory = this;
                                objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                if (objD != coroutineSingletons) {
                                    str14 = str9;
                                    metroTicketBooking8 = metroTicketBooking2;
                                    obj7 = objD;
                                    toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                                    productReceiptData3 = productReceiptData2;
                                    list = (List) obj7;
                                    String str1111 = metroTicketBooking8.d.f5431a;
                                    if (productReceiptData3 != null) {
                                        strR = productReceiptData3.r();
                                    } else {
                                        strR = null;
                                    }
                                    stringProvider4 = stringProvider;
                                    String strA7 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    j14 = j9;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                                    objB6 = productSummaryUIStateFactory.b(str1111, strR, strA7, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    coroutineSingletons = coroutineSingletons;
                                    if (objB6 != coroutineSingletons) {
                                        function19 = function12;
                                        list2 = list;
                                        obj8 = objB6;
                                        bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                        j15 = j14;
                                        strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                        chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                        list3 = list2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                        stringProvider5 = stringProvider4;
                                        objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        if (objB7 != coroutineSingletons) {
                                            bookingDetailsUIState2 = bookingDetailsUIState;
                                            obj9 = objB7;
                                            str15 = strA;
                                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                            chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                            j16 = j15;
                                            list4 = list3;
                                            CoroutineSingletons coroutineSingletons17 = coroutineSingletons;
                                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                            j17 = j16;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                            bookingDetailsUIState3 = bookingDetailsUIState2;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                            stringProvider6 = stringProvider5;
                                            objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                            coroutineSingletons3 = coroutineSingletons17;
                                            if (objB8 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            obj10 = objB8;
                                            z3 = z2;
                                            bookingDetailsUIState4 = bookingDetailsUIState3;
                                            chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                            list5 = list4;
                                            toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                            j18 = j17;
                                            UIFontWeight uIFontWeight6 = UIFontWeight.SemiBold;
                                            TextUIState.ChaloTextUIState chaloTextUIStateC12 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight6, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                            ChaloTextStyleHelper chaloTextStyleHelper18 = chaloTextStyleHelper11;
                                            TextUIState.ChaloTextUIState chaloTextUIStateC13 = ChaloTextStyleHelper.c(chaloTextStyleHelper18, str15, null, null, uIFontWeight6, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                            chaloTextStyleHelper6 = chaloTextStyleHelper18;
                                            coroutineSingletons4 = coroutineSingletons3;
                                            stringProvider7 = stringProvider6;
                                            j19 = j18;
                                            priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC12, chaloTextUIStateC13, null, 9), EmptyList.f17557a, null);
                                            if (z3) {
                                                switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                                    case 1:
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                        j21 = j19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                        stringProvider8 = stringProvider7;
                                                        objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                        coroutineSingletons5 = coroutineSingletons4;
                                                        if (objB9 == coroutineSingletons5) {
                                                            return coroutineSingletons5;
                                                        }
                                                        priceDetailsUIState2 = priceDetailsUIState;
                                                        obj11 = objB9;
                                                        chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                        CoroutineSingletons coroutineSingletons18 = coroutineSingletons5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                        bookingDetailsUIState5 = bookingDetailsUIState4;
                                                        stringProvider7 = stringProvider8;
                                                        objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                        coroutineSingletons4 = coroutineSingletons18;
                                                        if (objB10 == coroutineSingletons4) {
                                                            return coroutineSingletons4;
                                                        }
                                                        bookingDetailsUIState6 = bookingDetailsUIState5;
                                                        priceDetailsUIState3 = priceDetailsUIState2;
                                                        List list13 = list5;
                                                        chaloTextUIState = chaloTextUIStateC;
                                                        obj12 = objB10;
                                                        j22 = j21;
                                                        chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                        list6 = list13;
                                                        TicketSupportUIState ticketSupportUIState8 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                        list5 = list6;
                                                        str14 = str14;
                                                        priceDetailsUIState = priceDetailsUIState3;
                                                        j20 = j22;
                                                        ticketSupportUIState = ticketSupportUIState8;
                                                        bookingDetailsUIState4 = bookingDetailsUIState6;
                                                        MetroTicketAppModel metroTicketAppModel11 = metroTicketBooking8.d;
                                                        String str1112 = str14;
                                                        Map map11 = metroTicketAppModel11.l;
                                                        Function1 function211 = function1;
                                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                        long j213 = metroTicketAppModel11.k;
                                                        boolean z14 = !metroTicketAppModel11.h(j20);
                                                        Long l11 = new Long(j213);
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                        productSummaryStatusUiData = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$13 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                        objA = a(productReceiptData3, metroTicketBooking8, map11, str1112, l11, EmptyList.f17557a, z14, function211, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$13);
                                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$13;
                                                        if (objA == coroutineSingletons4) {
                                                            return coroutineSingletons4;
                                                        }
                                                        priceDetailsUIState4 = priceDetailsUIState;
                                                        obj13 = objA;
                                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                                        list7 = list5;
                                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                        ticketSupportUIState2 = ticketSupportUIState;
                                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                                        if (productReceiptData3 == null) {
                                                            break;
                                                        }
                                                        ticketInfoUIState2 = ticketInfoUIState;
                                                        priceDetailsUIState5 = priceDetailsUIState4;
                                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        j20 = j19;
                                                        break;
                                                    default:
                                                        throw new NoWhenBranchMatchedException();
                                                }
                                            } else {
                                                j20 = j19;
                                            }
                                            ticketSupportUIState = null;
                                            MetroTicketAppModel metroTicketAppModel12 = metroTicketBooking8.d;
                                            String str1113 = str14;
                                            Map map12 = metroTicketAppModel12.l;
                                            Function1 function212 = function1;
                                            chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                            long j214 = metroTicketAppModel12.k;
                                            boolean z15 = !metroTicketAppModel12.h(j20);
                                            Long l12 = new Long(j214);
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                            productSummaryStatusUiData = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                            ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$14 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                            objA = a(productReceiptData3, metroTicketBooking8, map12, str1113, l12, EmptyList.f17557a, z15, function212, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$14);
                                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$14;
                                            if (objA == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            priceDetailsUIState4 = priceDetailsUIState;
                                            obj13 = objA;
                                            bookingDetailsUIState7 = bookingDetailsUIState4;
                                            list7 = list5;
                                            toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                            ticketSupportUIState2 = ticketSupportUIState;
                                            ticketInfoUIState = (TicketInfoUIState) obj13;
                                            if (productReceiptData3 == null) {
                                                break;
                                            }
                                            ticketInfoUIState2 = ticketInfoUIState;
                                            priceDetailsUIState5 = priceDetailsUIState4;
                                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                        }
                                    }
                                }
                                return coroutineSingletons;
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return coroutineSingletons6;
            case 1:
                obj = obj13;
                long j30 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                boolean z16 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0;
                ChaloTextStyleHelper chaloTextStyleHelper19 = (ChaloTextStyleHelper) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                function3 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                Function1 function30 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                Function1 function31 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                str2 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                ProductReceiptData productReceiptData4 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                metroTicketBooking2 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj);
                function2 = function30;
                function1 = function31;
                j2 = j30;
                chaloTextStyleHelper = chaloTextStyleHelper19;
                z2 = z16;
                productReceiptData2 = productReceiptData4;
                almostBlackColor = almostBlackColor2;
                toolbarUIState = new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) obj, almostBlackColor2, null, null, null, 124), null, null, null, 0.0f, null, null, 253);
                i = WhenMappings.f8789a[metroTicketBooking2.d.e.ordinal()];
                redBase = ChaloColorToken.RedBase.f9846a;
                chaloTextStyleHelper2 = chaloTextStyleHelper11;
                greenBase = ChaloColorToken.GreenBase.f9800a;
                switch (i) {
                    case 1:
                        stringProvider = stringProvider9;
                        str3 = str2;
                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                        j3 = j2;
                        amountAddedText = amountAddedText3;
                        busTicketStatusSpec = new BusTicketStatusSpec(greenBase, 11);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = function3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = toolbarUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = busTicketStatusSpec;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 2;
                        objB = stringProvider.b(StringEnum.ACTIVE, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        coroutineSingletons = coroutineSingletons6;
                        if (objB != coroutineSingletons) {
                            str4 = str3;
                            metroTicketBooking3 = metroTicketBooking2;
                            obj2 = objB;
                            function4 = function3;
                            toolbarUIState2 = toolbarUIState;
                            function5 = function1;
                            busTicketStatusSpec2 = busTicketStatusSpec;
                            function6 = function2;
                            j4 = j3;
                            busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec2, new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.TitleLarge, amountAddedText, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
                            metroTicketBooking2 = metroTicketBooking3;
                            toolbarUIState4 = toolbarUIState2;
                            function12 = function6;
                            function1 = function5;
                            str9 = str4;
                            j9 = j4;
                            function3 = function4;
                            toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                            productSummaryUIStateFactory = this;
                            objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            if (objD != coroutineSingletons) {
                                str14 = str9;
                                metroTicketBooking8 = metroTicketBooking2;
                                obj7 = objD;
                                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                                productReceiptData3 = productReceiptData2;
                                list = (List) obj7;
                                String str1114 = metroTicketBooking8.d.f5431a;
                                if (productReceiptData3 != null) {
                                    strR = productReceiptData3.r();
                                } else {
                                    strR = null;
                                }
                                stringProvider4 = stringProvider;
                                String strA8 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                j14 = j9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                                objB6 = productSummaryUIStateFactory.b(str1114, strR, strA8, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                coroutineSingletons = coroutineSingletons;
                                if (objB6 != coroutineSingletons) {
                                    function19 = function12;
                                    list2 = list;
                                    obj8 = objB6;
                                    bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                    j15 = j14;
                                    strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                    chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    list3 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                    stringProvider5 = stringProvider4;
                                    objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    if (objB7 != coroutineSingletons) {
                                        bookingDetailsUIState2 = bookingDetailsUIState;
                                        obj9 = objB7;
                                        str15 = strA;
                                        toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                        j16 = j15;
                                        list4 = list3;
                                        CoroutineSingletons coroutineSingletons19 = coroutineSingletons;
                                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                        j17 = j16;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                        bookingDetailsUIState3 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                        stringProvider6 = stringProvider5;
                                        objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons3 = coroutineSingletons19;
                                        if (objB8 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        obj10 = objB8;
                                        z3 = z2;
                                        bookingDetailsUIState4 = bookingDetailsUIState3;
                                        chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                        list5 = list4;
                                        toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                        j18 = j17;
                                        UIFontWeight uIFontWeight7 = UIFontWeight.SemiBold;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC14 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight7, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        ChaloTextStyleHelper chaloTextStyleHelper110 = chaloTextStyleHelper11;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC15 = ChaloTextStyleHelper.c(chaloTextStyleHelper110, str15, null, null, uIFontWeight7, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        chaloTextStyleHelper6 = chaloTextStyleHelper110;
                                        coroutineSingletons4 = coroutineSingletons3;
                                        stringProvider7 = stringProvider6;
                                        j19 = j18;
                                        priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC14, chaloTextUIStateC15, null, 9), EmptyList.f17557a, null);
                                        if (z3) {
                                            switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                                case 1:
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    j21 = j19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                    stringProvider8 = stringProvider7;
                                                    objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons5 = coroutineSingletons4;
                                                    if (objB9 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    priceDetailsUIState2 = priceDetailsUIState;
                                                    obj11 = objB9;
                                                    chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                    CoroutineSingletons coroutineSingletons110 = coroutineSingletons5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                    bookingDetailsUIState5 = bookingDetailsUIState4;
                                                    stringProvider7 = stringProvider8;
                                                    objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons4 = coroutineSingletons110;
                                                    if (objB10 == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    bookingDetailsUIState6 = bookingDetailsUIState5;
                                                    priceDetailsUIState3 = priceDetailsUIState2;
                                                    List list14 = list5;
                                                    chaloTextUIState = chaloTextUIStateC;
                                                    obj12 = objB10;
                                                    j22 = j21;
                                                    chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                    list6 = list14;
                                                    TicketSupportUIState ticketSupportUIState9 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                    list5 = list6;
                                                    str14 = str14;
                                                    priceDetailsUIState = priceDetailsUIState3;
                                                    j20 = j22;
                                                    ticketSupportUIState = ticketSupportUIState9;
                                                    bookingDetailsUIState4 = bookingDetailsUIState6;
                                                    MetroTicketAppModel metroTicketAppModel13 = metroTicketBooking8.d;
                                                    String str1115 = str14;
                                                    Map map13 = metroTicketAppModel13.l;
                                                    Function1 function213 = function1;
                                                    chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                    long j215 = metroTicketAppModel13.k;
                                                    boolean z17 = !metroTicketAppModel13.h(j20);
                                                    Long l13 = new Long(j215);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                    productSummaryStatusUiData = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                    ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$15 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                    objA = a(productReceiptData3, metroTicketBooking8, map13, str1115, l13, EmptyList.f17557a, z17, function213, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$15);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$15;
                                                    if (objA == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    priceDetailsUIState4 = priceDetailsUIState;
                                                    obj13 = objA;
                                                    bookingDetailsUIState7 = bookingDetailsUIState4;
                                                    list7 = list5;
                                                    toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                    ticketSupportUIState2 = ticketSupportUIState;
                                                    ticketInfoUIState = (TicketInfoUIState) obj13;
                                                    if (productReceiptData3 == null) {
                                                        break;
                                                    }
                                                    ticketInfoUIState2 = ticketInfoUIState;
                                                    priceDetailsUIState5 = priceDetailsUIState4;
                                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    j20 = j19;
                                                    break;
                                                default:
                                                    throw new NoWhenBranchMatchedException();
                                            }
                                        } else {
                                            j20 = j19;
                                        }
                                        ticketSupportUIState = null;
                                        MetroTicketAppModel metroTicketAppModel14 = metroTicketBooking8.d;
                                        String str1116 = str14;
                                        Map map14 = metroTicketAppModel14.l;
                                        Function1 function214 = function1;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                        long j216 = metroTicketAppModel14.k;
                                        boolean z18 = !metroTicketAppModel14.h(j20);
                                        Long l14 = new Long(j216);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                        productSummaryStatusUiData = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$16 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                        objA = a(productReceiptData3, metroTicketBooking8, map14, str1116, l14, EmptyList.f17557a, z18, function214, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$16);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$16;
                                        if (objA == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        priceDetailsUIState4 = priceDetailsUIState;
                                        obj13 = objA;
                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                        list7 = list5;
                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                        ticketSupportUIState2 = ticketSupportUIState;
                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                        if (productReceiptData3 == null) {
                                            break;
                                        }
                                        ticketInfoUIState2 = ticketInfoUIState;
                                        priceDetailsUIState5 = priceDetailsUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                    case 3:
                        str5 = str2;
                        j5 = j2;
                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                        busTicketStatusSpec3 = new BusTicketStatusSpec(greenBase, 11);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str5;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = function3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = toolbarUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = busTicketStatusSpec3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j5;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 3;
                        objB2 = stringProvider9.b(StringEnum.COMPLETED, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        coroutineSingletons = coroutineSingletons6;
                        if (objB2 != coroutineSingletons) {
                            str6 = str5;
                            metroTicketBooking4 = metroTicketBooking2;
                            obj3 = objB2;
                            function7 = function3;
                            function8 = function1;
                            function9 = function2;
                            busTicketStatusSpec4 = busTicketStatusSpec3;
                            j6 = j5;
                            busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec4, new TextUIState.ChaloTextUIState((String) obj3, UITextStyle.TitleLarge, amountAddedText3, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_GREEN_TICK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                            metroTicketBooking2 = metroTicketBooking4;
                            function3 = function7;
                            function12 = function9;
                            function1 = function8;
                            str9 = str6;
                            toolbarUIState4 = toolbarUIState;
                            j9 = j6;
                            stringProvider = stringProvider9;
                            toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                            productSummaryUIStateFactory = this;
                            objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            if (objD != coroutineSingletons) {
                                str14 = str9;
                                metroTicketBooking8 = metroTicketBooking2;
                                obj7 = objD;
                                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                                productReceiptData3 = productReceiptData2;
                                list = (List) obj7;
                                String str1117 = metroTicketBooking8.d.f5431a;
                                if (productReceiptData3 != null) {
                                    strR = productReceiptData3.r();
                                } else {
                                    strR = null;
                                }
                                stringProvider4 = stringProvider;
                                String strA9 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                j14 = j9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                                objB6 = productSummaryUIStateFactory.b(str1117, strR, strA9, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                coroutineSingletons = coroutineSingletons;
                                if (objB6 != coroutineSingletons) {
                                    function19 = function12;
                                    list2 = list;
                                    obj8 = objB6;
                                    bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                    j15 = j14;
                                    strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                    chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    list3 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                    stringProvider5 = stringProvider4;
                                    objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    if (objB7 != coroutineSingletons) {
                                        bookingDetailsUIState2 = bookingDetailsUIState;
                                        obj9 = objB7;
                                        str15 = strA;
                                        toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                        j16 = j15;
                                        list4 = list3;
                                        CoroutineSingletons coroutineSingletons111 = coroutineSingletons;
                                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                        j17 = j16;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                        bookingDetailsUIState3 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                        stringProvider6 = stringProvider5;
                                        objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons3 = coroutineSingletons111;
                                        if (objB8 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        obj10 = objB8;
                                        z3 = z2;
                                        bookingDetailsUIState4 = bookingDetailsUIState3;
                                        chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                        list5 = list4;
                                        toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                        j18 = j17;
                                        UIFontWeight uIFontWeight8 = UIFontWeight.SemiBold;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC16 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight8, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        ChaloTextStyleHelper chaloTextStyleHelper111 = chaloTextStyleHelper11;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC17 = ChaloTextStyleHelper.c(chaloTextStyleHelper111, str15, null, null, uIFontWeight8, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        chaloTextStyleHelper6 = chaloTextStyleHelper111;
                                        coroutineSingletons4 = coroutineSingletons3;
                                        stringProvider7 = stringProvider6;
                                        j19 = j18;
                                        priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC16, chaloTextUIStateC17, null, 9), EmptyList.f17557a, null);
                                        if (z3) {
                                            switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                                case 1:
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    j21 = j19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                    stringProvider8 = stringProvider7;
                                                    objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons5 = coroutineSingletons4;
                                                    if (objB9 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    priceDetailsUIState2 = priceDetailsUIState;
                                                    obj11 = objB9;
                                                    chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                    CoroutineSingletons coroutineSingletons112 = coroutineSingletons5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                    bookingDetailsUIState5 = bookingDetailsUIState4;
                                                    stringProvider7 = stringProvider8;
                                                    objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons4 = coroutineSingletons112;
                                                    if (objB10 == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    bookingDetailsUIState6 = bookingDetailsUIState5;
                                                    priceDetailsUIState3 = priceDetailsUIState2;
                                                    List list15 = list5;
                                                    chaloTextUIState = chaloTextUIStateC;
                                                    obj12 = objB10;
                                                    j22 = j21;
                                                    chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                    list6 = list15;
                                                    TicketSupportUIState ticketSupportUIState10 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                    list5 = list6;
                                                    str14 = str14;
                                                    priceDetailsUIState = priceDetailsUIState3;
                                                    j20 = j22;
                                                    ticketSupportUIState = ticketSupportUIState10;
                                                    bookingDetailsUIState4 = bookingDetailsUIState6;
                                                    MetroTicketAppModel metroTicketAppModel15 = metroTicketBooking8.d;
                                                    String str1118 = str14;
                                                    Map map15 = metroTicketAppModel15.l;
                                                    Function1 function215 = function1;
                                                    chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                    long j217 = metroTicketAppModel15.k;
                                                    boolean z19 = !metroTicketAppModel15.h(j20);
                                                    Long l15 = new Long(j217);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                    productSummaryStatusUiData = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                    ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$17 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                    objA = a(productReceiptData3, metroTicketBooking8, map15, str1118, l15, EmptyList.f17557a, z19, function215, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$17);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$17;
                                                    if (objA == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    priceDetailsUIState4 = priceDetailsUIState;
                                                    obj13 = objA;
                                                    bookingDetailsUIState7 = bookingDetailsUIState4;
                                                    list7 = list5;
                                                    toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                    ticketSupportUIState2 = ticketSupportUIState;
                                                    ticketInfoUIState = (TicketInfoUIState) obj13;
                                                    if (productReceiptData3 == null) {
                                                        break;
                                                    }
                                                    ticketInfoUIState2 = ticketInfoUIState;
                                                    priceDetailsUIState5 = priceDetailsUIState4;
                                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    j20 = j19;
                                                    break;
                                                default:
                                                    throw new NoWhenBranchMatchedException();
                                            }
                                        } else {
                                            j20 = j19;
                                        }
                                        ticketSupportUIState = null;
                                        MetroTicketAppModel metroTicketAppModel16 = metroTicketBooking8.d;
                                        String str1119 = str14;
                                        Map map16 = metroTicketAppModel16.l;
                                        Function1 function216 = function1;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                        long j218 = metroTicketAppModel16.k;
                                        boolean z110 = !metroTicketAppModel16.h(j20);
                                        Long l16 = new Long(j218);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                        productSummaryStatusUiData = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$18 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                        objA = a(productReceiptData3, metroTicketBooking8, map16, str1119, l16, EmptyList.f17557a, z110, function216, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$18);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$18;
                                        if (objA == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        priceDetailsUIState4 = priceDetailsUIState;
                                        obj13 = objA;
                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                        list7 = list5;
                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                        ticketSupportUIState2 = ticketSupportUIState;
                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                        if (productReceiptData3 == null) {
                                            break;
                                        }
                                        ticketInfoUIState2 = ticketInfoUIState;
                                        priceDetailsUIState5 = priceDetailsUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 4:
                        stringProvider2 = stringProvider9;
                        str7 = str2;
                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                        j7 = j2;
                        busTicketStatusSpec5 = new BusTicketStatusSpec(redBase, 11);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str7;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = function3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = toolbarUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = busTicketStatusSpec5;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j7;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 4;
                        objB3 = stringProvider2.b(StringEnum.EXPIRED, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        coroutineSingletons2 = coroutineSingletons6;
                        if (objB3 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        str8 = str7;
                        metroTicketBooking5 = metroTicketBooking2;
                        obj4 = objB3;
                        function10 = function3;
                        toolbarUIState3 = toolbarUIState;
                        function11 = function1;
                        busTicketStatusSpec6 = busTicketStatusSpec5;
                        j8 = j7;
                        Function1 function217 = function2;
                        busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec6, new TextUIState.ChaloTextUIState((String) obj4, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                        coroutineSingletons = coroutineSingletons2;
                        j9 = j8;
                        toolbarUIState4 = toolbarUIState3;
                        function3 = function10;
                        function1 = function11;
                        str9 = str8;
                        stringProvider = stringProvider2;
                        metroTicketBooking2 = metroTicketBooking5;
                        function12 = function217;
                        toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                        productSummaryUIStateFactory = this;
                        objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        if (objD != coroutineSingletons) {
                            str14 = str9;
                            metroTicketBooking8 = metroTicketBooking2;
                            obj7 = objD;
                            toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                            productReceiptData3 = productReceiptData2;
                            list = (List) obj7;
                            String str11110 = metroTicketBooking8.d.f5431a;
                            if (productReceiptData3 != null) {
                                strR = productReceiptData3.r();
                            } else {
                                strR = null;
                            }
                            stringProvider4 = stringProvider;
                            String strA10 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            j14 = j9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                            objB6 = productSummaryUIStateFactory.b(str11110, strR, strA10, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons = coroutineSingletons;
                            if (objB6 != coroutineSingletons) {
                                function19 = function12;
                                list2 = list;
                                obj8 = objB6;
                                bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                j15 = j14;
                                strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                list3 = list2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                stringProvider5 = stringProvider4;
                                objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                if (objB7 != coroutineSingletons) {
                                    bookingDetailsUIState2 = bookingDetailsUIState;
                                    obj9 = objB7;
                                    str15 = strA;
                                    toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                    chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                    j16 = j15;
                                    list4 = list3;
                                    CoroutineSingletons coroutineSingletons113 = coroutineSingletons;
                                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                    j17 = j16;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    bookingDetailsUIState3 = bookingDetailsUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                    stringProvider6 = stringProvider5;
                                    objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    coroutineSingletons3 = coroutineSingletons113;
                                    if (objB8 == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    obj10 = objB8;
                                    z3 = z2;
                                    bookingDetailsUIState4 = bookingDetailsUIState3;
                                    chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                    list5 = list4;
                                    toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                    j18 = j17;
                                    UIFontWeight uIFontWeight9 = UIFontWeight.SemiBold;
                                    TextUIState.ChaloTextUIState chaloTextUIStateC18 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight9, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                    ChaloTextStyleHelper chaloTextStyleHelper112 = chaloTextStyleHelper11;
                                    TextUIState.ChaloTextUIState chaloTextUIStateC19 = ChaloTextStyleHelper.c(chaloTextStyleHelper112, str15, null, null, uIFontWeight9, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                    chaloTextStyleHelper6 = chaloTextStyleHelper112;
                                    coroutineSingletons4 = coroutineSingletons3;
                                    stringProvider7 = stringProvider6;
                                    j19 = j18;
                                    priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC18, chaloTextUIStateC19, null, 9), EmptyList.f17557a, null);
                                    if (z3) {
                                        switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                            case 1:
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                j21 = j19;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                stringProvider8 = stringProvider7;
                                                objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                coroutineSingletons5 = coroutineSingletons4;
                                                if (objB9 == coroutineSingletons5) {
                                                    return coroutineSingletons5;
                                                }
                                                priceDetailsUIState2 = priceDetailsUIState;
                                                obj11 = objB9;
                                                chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                CoroutineSingletons coroutineSingletons114 = coroutineSingletons5;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                bookingDetailsUIState5 = bookingDetailsUIState4;
                                                stringProvider7 = stringProvider8;
                                                objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                coroutineSingletons4 = coroutineSingletons114;
                                                if (objB10 == coroutineSingletons4) {
                                                    return coroutineSingletons4;
                                                }
                                                bookingDetailsUIState6 = bookingDetailsUIState5;
                                                priceDetailsUIState3 = priceDetailsUIState2;
                                                List list16 = list5;
                                                chaloTextUIState = chaloTextUIStateC;
                                                obj12 = objB10;
                                                j22 = j21;
                                                chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                list6 = list16;
                                                TicketSupportUIState ticketSupportUIState11 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                list5 = list6;
                                                str14 = str14;
                                                priceDetailsUIState = priceDetailsUIState3;
                                                j20 = j22;
                                                ticketSupportUIState = ticketSupportUIState11;
                                                bookingDetailsUIState4 = bookingDetailsUIState6;
                                                MetroTicketAppModel metroTicketAppModel17 = metroTicketBooking8.d;
                                                String str11111 = str14;
                                                Map map17 = metroTicketAppModel17.l;
                                                Function1 function218 = function1;
                                                chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                long j219 = metroTicketAppModel17.k;
                                                boolean z111 = !metroTicketAppModel17.h(j20);
                                                Long l17 = new Long(j219);
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                productSummaryStatusUiData = null;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$19 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                objA = a(productReceiptData3, metroTicketBooking8, map17, str11111, l17, EmptyList.f17557a, z111, function218, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$19);
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$19;
                                                if (objA == coroutineSingletons4) {
                                                    return coroutineSingletons4;
                                                }
                                                priceDetailsUIState4 = priceDetailsUIState;
                                                obj13 = objA;
                                                bookingDetailsUIState7 = bookingDetailsUIState4;
                                                list7 = list5;
                                                toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                ticketSupportUIState2 = ticketSupportUIState;
                                                ticketInfoUIState = (TicketInfoUIState) obj13;
                                                if (productReceiptData3 == null) {
                                                    break;
                                                }
                                                ticketInfoUIState2 = ticketInfoUIState;
                                                priceDetailsUIState5 = priceDetailsUIState4;
                                                productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                                j20 = j19;
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        j20 = j19;
                                    }
                                    ticketSupportUIState = null;
                                    MetroTicketAppModel metroTicketAppModel18 = metroTicketBooking8.d;
                                    String str11112 = str14;
                                    Map map18 = metroTicketAppModel18.l;
                                    Function1 function219 = function1;
                                    chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                    long j2110 = metroTicketAppModel18.k;
                                    boolean z112 = !metroTicketAppModel18.h(j20);
                                    Long l18 = new Long(j2110);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                    productSummaryStatusUiData = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                    ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$110 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                    objA = a(productReceiptData3, metroTicketBooking8, map18, str11112, l18, EmptyList.f17557a, z112, function219, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$110);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$110;
                                    if (objA == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    priceDetailsUIState4 = priceDetailsUIState;
                                    obj13 = objA;
                                    bookingDetailsUIState7 = bookingDetailsUIState4;
                                    list7 = list5;
                                    toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                    ticketSupportUIState2 = ticketSupportUIState;
                                    ticketInfoUIState = (TicketInfoUIState) obj13;
                                    if (productReceiptData3 == null) {
                                        break;
                                    }
                                    ticketInfoUIState2 = ticketInfoUIState;
                                    priceDetailsUIState5 = priceDetailsUIState4;
                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 5:
                    case 6:
                    case 7:
                        coroutineSingletons = coroutineSingletons6;
                        stringProvider = stringProvider9;
                        toolbarUIState4 = toolbarUIState;
                        j9 = j2;
                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                        str9 = str2;
                        function12 = function2;
                        busTicketStatusUiState = null;
                        toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                        productSummaryUIStateFactory = this;
                        objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        if (objD != coroutineSingletons) {
                            str14 = str9;
                            metroTicketBooking8 = metroTicketBooking2;
                            obj7 = objD;
                            toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                            productReceiptData3 = productReceiptData2;
                            list = (List) obj7;
                            String str11113 = metroTicketBooking8.d.f5431a;
                            if (productReceiptData3 != null) {
                                strR = productReceiptData3.r();
                            } else {
                                strR = null;
                            }
                            stringProvider4 = stringProvider;
                            String strA11 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            j14 = j9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                            objB6 = productSummaryUIStateFactory.b(str11113, strR, strA11, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons = coroutineSingletons;
                            if (objB6 != coroutineSingletons) {
                                function19 = function12;
                                list2 = list;
                                obj8 = objB6;
                                bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                j15 = j14;
                                strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                list3 = list2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                stringProvider5 = stringProvider4;
                                objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                if (objB7 != coroutineSingletons) {
                                    bookingDetailsUIState2 = bookingDetailsUIState;
                                    obj9 = objB7;
                                    str15 = strA;
                                    toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                    chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                    j16 = j15;
                                    list4 = list3;
                                    CoroutineSingletons coroutineSingletons115 = coroutineSingletons;
                                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                    j17 = j16;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    bookingDetailsUIState3 = bookingDetailsUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                    stringProvider6 = stringProvider5;
                                    objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    coroutineSingletons3 = coroutineSingletons115;
                                    if (objB8 == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    obj10 = objB8;
                                    z3 = z2;
                                    bookingDetailsUIState4 = bookingDetailsUIState3;
                                    chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                    list5 = list4;
                                    toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                    j18 = j17;
                                    UIFontWeight uIFontWeight10 = UIFontWeight.SemiBold;
                                    TextUIState.ChaloTextUIState chaloTextUIStateC110 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight10, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                    ChaloTextStyleHelper chaloTextStyleHelper113 = chaloTextStyleHelper11;
                                    TextUIState.ChaloTextUIState chaloTextUIStateC111 = ChaloTextStyleHelper.c(chaloTextStyleHelper113, str15, null, null, uIFontWeight10, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                    chaloTextStyleHelper6 = chaloTextStyleHelper113;
                                    coroutineSingletons4 = coroutineSingletons3;
                                    stringProvider7 = stringProvider6;
                                    j19 = j18;
                                    priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC110, chaloTextUIStateC111, null, 9), EmptyList.f17557a, null);
                                    if (z3) {
                                        switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                            case 1:
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                j21 = j19;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                stringProvider8 = stringProvider7;
                                                objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                coroutineSingletons5 = coroutineSingletons4;
                                                if (objB9 == coroutineSingletons5) {
                                                    return coroutineSingletons5;
                                                }
                                                priceDetailsUIState2 = priceDetailsUIState;
                                                obj11 = objB9;
                                                chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                CoroutineSingletons coroutineSingletons116 = coroutineSingletons5;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                bookingDetailsUIState5 = bookingDetailsUIState4;
                                                stringProvider7 = stringProvider8;
                                                objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                coroutineSingletons4 = coroutineSingletons116;
                                                if (objB10 == coroutineSingletons4) {
                                                    return coroutineSingletons4;
                                                }
                                                bookingDetailsUIState6 = bookingDetailsUIState5;
                                                priceDetailsUIState3 = priceDetailsUIState2;
                                                List list17 = list5;
                                                chaloTextUIState = chaloTextUIStateC;
                                                obj12 = objB10;
                                                j22 = j21;
                                                chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                list6 = list17;
                                                TicketSupportUIState ticketSupportUIState12 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                list5 = list6;
                                                str14 = str14;
                                                priceDetailsUIState = priceDetailsUIState3;
                                                j20 = j22;
                                                ticketSupportUIState = ticketSupportUIState12;
                                                bookingDetailsUIState4 = bookingDetailsUIState6;
                                                MetroTicketAppModel metroTicketAppModel19 = metroTicketBooking8.d;
                                                String str11114 = str14;
                                                Map map19 = metroTicketAppModel19.l;
                                                Function1 function2110 = function1;
                                                chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                long j2111 = metroTicketAppModel19.k;
                                                boolean z113 = !metroTicketAppModel19.h(j20);
                                                Long l19 = new Long(j2111);
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                productSummaryStatusUiData = null;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$111 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                objA = a(productReceiptData3, metroTicketBooking8, map19, str11114, l19, EmptyList.f17557a, z113, function2110, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$111);
                                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$111;
                                                if (objA == coroutineSingletons4) {
                                                    return coroutineSingletons4;
                                                }
                                                priceDetailsUIState4 = priceDetailsUIState;
                                                obj13 = objA;
                                                bookingDetailsUIState7 = bookingDetailsUIState4;
                                                list7 = list5;
                                                toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                ticketSupportUIState2 = ticketSupportUIState;
                                                ticketInfoUIState = (TicketInfoUIState) obj13;
                                                if (productReceiptData3 == null) {
                                                    break;
                                                }
                                                ticketInfoUIState2 = ticketInfoUIState;
                                                priceDetailsUIState5 = priceDetailsUIState4;
                                                productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                                j20 = j19;
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        j20 = j19;
                                    }
                                    ticketSupportUIState = null;
                                    MetroTicketAppModel metroTicketAppModel110 = metroTicketBooking8.d;
                                    String str11115 = str14;
                                    Map map110 = metroTicketAppModel110.l;
                                    Function1 function2111 = function1;
                                    chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                    long j2112 = metroTicketAppModel110.k;
                                    boolean z114 = !metroTicketAppModel110.h(j20);
                                    Long l110 = new Long(j2112);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                    productSummaryStatusUiData = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                    ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$112 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                    objA = a(productReceiptData3, metroTicketBooking8, map110, str11115, l110, EmptyList.f17557a, z114, function2111, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$112);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$112;
                                    if (objA == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    priceDetailsUIState4 = priceDetailsUIState;
                                    obj13 = objA;
                                    bookingDetailsUIState7 = bookingDetailsUIState4;
                                    list7 = list5;
                                    toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                    ticketSupportUIState2 = ticketSupportUIState;
                                    ticketInfoUIState = (TicketInfoUIState) obj13;
                                    if (productReceiptData3 == null) {
                                        break;
                                    }
                                    ticketInfoUIState2 = ticketInfoUIState;
                                    priceDetailsUIState5 = priceDetailsUIState4;
                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 8:
                        str10 = str2;
                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                        j10 = j2;
                        busTicketStatusSpec7 = new BusTicketStatusSpec(greenBase, 11);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str10;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = function3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = toolbarUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = busTicketStatusSpec7;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j10;
                        amountAddedText2 = amountAddedText3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 5;
                        stringProvider3 = stringProvider9;
                        objB4 = stringProvider3.b(StringEnum.TAPPED_IN, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        if (objB4 != coroutineSingletons6) {
                            str11 = str10;
                            metroTicketBooking6 = metroTicketBooking2;
                            function13 = function3;
                            toolbarUIState5 = toolbarUIState;
                            obj5 = objB4;
                            function14 = function1;
                            busTicketStatusSpec8 = busTicketStatusSpec7;
                            function15 = function2;
                            j11 = j10;
                            busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec8, new TextUIState.ChaloTextUIState((String) obj5, UITextStyle.TitleLarge, amountAddedText2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
                            ToolbarUIState toolbarUIState8 = toolbarUIState5;
                            coroutineSingletons = coroutineSingletons6;
                            stringProvider = stringProvider3;
                            toolbarUIState4 = toolbarUIState8;
                            metroTicketBooking2 = metroTicketBooking6;
                            j9 = j11;
                            function3 = function13;
                            function12 = function15;
                            function1 = function14;
                            str9 = str11;
                            toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                            productSummaryUIStateFactory = this;
                            objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            if (objD != coroutineSingletons) {
                                str14 = str9;
                                metroTicketBooking8 = metroTicketBooking2;
                                obj7 = objD;
                                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                                productReceiptData3 = productReceiptData2;
                                list = (List) obj7;
                                String str11116 = metroTicketBooking8.d.f5431a;
                                if (productReceiptData3 != null) {
                                    strR = productReceiptData3.r();
                                } else {
                                    strR = null;
                                }
                                stringProvider4 = stringProvider;
                                String strA12 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                j14 = j9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                                objB6 = productSummaryUIStateFactory.b(str11116, strR, strA12, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                coroutineSingletons = coroutineSingletons;
                                if (objB6 != coroutineSingletons) {
                                    function19 = function12;
                                    list2 = list;
                                    obj8 = objB6;
                                    bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                    j15 = j14;
                                    strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                    chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    list3 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                    stringProvider5 = stringProvider4;
                                    objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    if (objB7 != coroutineSingletons) {
                                        bookingDetailsUIState2 = bookingDetailsUIState;
                                        obj9 = objB7;
                                        str15 = strA;
                                        toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                        j16 = j15;
                                        list4 = list3;
                                        CoroutineSingletons coroutineSingletons117 = coroutineSingletons;
                                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                        j17 = j16;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                        bookingDetailsUIState3 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                        stringProvider6 = stringProvider5;
                                        objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons3 = coroutineSingletons117;
                                        if (objB8 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        obj10 = objB8;
                                        z3 = z2;
                                        bookingDetailsUIState4 = bookingDetailsUIState3;
                                        chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                        list5 = list4;
                                        toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                        j18 = j17;
                                        UIFontWeight uIFontWeight11 = UIFontWeight.SemiBold;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC112 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight11, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        ChaloTextStyleHelper chaloTextStyleHelper114 = chaloTextStyleHelper11;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC113 = ChaloTextStyleHelper.c(chaloTextStyleHelper114, str15, null, null, uIFontWeight11, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        chaloTextStyleHelper6 = chaloTextStyleHelper114;
                                        coroutineSingletons4 = coroutineSingletons3;
                                        stringProvider7 = stringProvider6;
                                        j19 = j18;
                                        priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC112, chaloTextUIStateC113, null, 9), EmptyList.f17557a, null);
                                        if (z3) {
                                            switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                                case 1:
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    j21 = j19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                    stringProvider8 = stringProvider7;
                                                    objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons5 = coroutineSingletons4;
                                                    if (objB9 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    priceDetailsUIState2 = priceDetailsUIState;
                                                    obj11 = objB9;
                                                    chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                    CoroutineSingletons coroutineSingletons118 = coroutineSingletons5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                    bookingDetailsUIState5 = bookingDetailsUIState4;
                                                    stringProvider7 = stringProvider8;
                                                    objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons4 = coroutineSingletons118;
                                                    if (objB10 == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    bookingDetailsUIState6 = bookingDetailsUIState5;
                                                    priceDetailsUIState3 = priceDetailsUIState2;
                                                    List list18 = list5;
                                                    chaloTextUIState = chaloTextUIStateC;
                                                    obj12 = objB10;
                                                    j22 = j21;
                                                    chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                    list6 = list18;
                                                    TicketSupportUIState ticketSupportUIState13 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                    list5 = list6;
                                                    str14 = str14;
                                                    priceDetailsUIState = priceDetailsUIState3;
                                                    j20 = j22;
                                                    ticketSupportUIState = ticketSupportUIState13;
                                                    bookingDetailsUIState4 = bookingDetailsUIState6;
                                                    MetroTicketAppModel metroTicketAppModel111 = metroTicketBooking8.d;
                                                    String str11117 = str14;
                                                    Map map111 = metroTicketAppModel111.l;
                                                    Function1 function2112 = function1;
                                                    chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                    long j2113 = metroTicketAppModel111.k;
                                                    boolean z115 = !metroTicketAppModel111.h(j20);
                                                    Long l111 = new Long(j2113);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                    productSummaryStatusUiData = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                    ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$113 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                    objA = a(productReceiptData3, metroTicketBooking8, map111, str11117, l111, EmptyList.f17557a, z115, function2112, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$113);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$113;
                                                    if (objA == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    priceDetailsUIState4 = priceDetailsUIState;
                                                    obj13 = objA;
                                                    bookingDetailsUIState7 = bookingDetailsUIState4;
                                                    list7 = list5;
                                                    toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                    ticketSupportUIState2 = ticketSupportUIState;
                                                    ticketInfoUIState = (TicketInfoUIState) obj13;
                                                    if (productReceiptData3 == null) {
                                                        break;
                                                    }
                                                    ticketInfoUIState2 = ticketInfoUIState;
                                                    priceDetailsUIState5 = priceDetailsUIState4;
                                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    j20 = j19;
                                                    break;
                                                default:
                                                    throw new NoWhenBranchMatchedException();
                                            }
                                        } else {
                                            j20 = j19;
                                        }
                                        ticketSupportUIState = null;
                                        MetroTicketAppModel metroTicketAppModel112 = metroTicketBooking8.d;
                                        String str11118 = str14;
                                        Map map112 = metroTicketAppModel112.l;
                                        Function1 function2113 = function1;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                        long j2114 = metroTicketAppModel112.k;
                                        boolean z116 = !metroTicketAppModel112.h(j20);
                                        Long l112 = new Long(j2114);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                        productSummaryStatusUiData = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$114 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                        objA = a(productReceiptData3, metroTicketBooking8, map112, str11118, l112, EmptyList.f17557a, z116, function2113, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$114);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$114;
                                        if (objA == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        priceDetailsUIState4 = priceDetailsUIState;
                                        obj13 = objA;
                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                        list7 = list5;
                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                        ticketSupportUIState2 = ticketSupportUIState;
                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                        if (productReceiptData3 == null) {
                                            break;
                                        }
                                        ticketInfoUIState2 = ticketInfoUIState;
                                        priceDetailsUIState5 = priceDetailsUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        return coroutineSingletons6;
                    case 9:
                        busTicketStatusSpec9 = new BusTicketStatusSpec(redBase, 11);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = function3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = toolbarUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = busTicketStatusSpec9;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        str12 = str2;
                        j12 = j2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j12;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 6;
                        objB5 = stringProvider9.b(StringEnum.CANCELLED, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        if (objB5 != coroutineSingletons6) {
                            metroTicketBooking7 = metroTicketBooking2;
                            obj6 = objB5;
                            function16 = function3;
                            toolbarUIState6 = toolbarUIState;
                            function17 = function1;
                            function18 = function2;
                            j13 = j12;
                            str13 = str12;
                            busTicketStatusSpec10 = busTicketStatusSpec9;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec10, new TextUIState.ChaloTextUIState((String) obj6, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                            coroutineSingletons = coroutineSingletons6;
                            metroTicketBooking2 = metroTicketBooking7;
                            str9 = str13;
                            j9 = j13;
                            toolbarUIState4 = toolbarUIState6;
                            function3 = function16;
                            function12 = function18;
                            function1 = function17;
                            stringProvider = stringProvider9;
                            toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                            productSummaryUIStateFactory = this;
                            objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            if (objD != coroutineSingletons) {
                                str14 = str9;
                                metroTicketBooking8 = metroTicketBooking2;
                                obj7 = objD;
                                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                                productReceiptData3 = productReceiptData2;
                                list = (List) obj7;
                                String str11119 = metroTicketBooking8.d.f5431a;
                                if (productReceiptData3 != null) {
                                    strR = productReceiptData3.r();
                                } else {
                                    strR = null;
                                }
                                stringProvider4 = stringProvider;
                                String strA13 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                j14 = j9;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                                objB6 = productSummaryUIStateFactory.b(str11119, strR, strA13, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                coroutineSingletons = coroutineSingletons;
                                if (objB6 != coroutineSingletons) {
                                    function19 = function12;
                                    list2 = list;
                                    obj8 = objB6;
                                    bookingDetailsUIState = (BookingDetailsUIState) obj8;
                                    j15 = j14;
                                    strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                                    chaloTextStyleHelper11 = chaloTextStyleHelper3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                    list3 = list2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                                    stringProvider5 = stringProvider4;
                                    objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    if (objB7 != coroutineSingletons) {
                                        bookingDetailsUIState2 = bookingDetailsUIState;
                                        obj9 = objB7;
                                        str15 = strA;
                                        toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper11;
                                        j16 = j15;
                                        list4 = list3;
                                        CoroutineSingletons coroutineSingletons119 = coroutineSingletons;
                                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                                        j17 = j16;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                                        bookingDetailsUIState3 = bookingDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                                        stringProvider6 = stringProvider5;
                                        objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons3 = coroutineSingletons119;
                                        if (objB8 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        obj10 = objB8;
                                        z3 = z2;
                                        bookingDetailsUIState4 = bookingDetailsUIState3;
                                        chaloTextStyleHelper5 = chaloTextStyleHelper11;
                                        list5 = list4;
                                        toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                        j18 = j17;
                                        UIFontWeight uIFontWeight12 = UIFontWeight.SemiBold;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC114 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight12, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        ChaloTextStyleHelper chaloTextStyleHelper115 = chaloTextStyleHelper11;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC115 = ChaloTextStyleHelper.c(chaloTextStyleHelper115, str15, null, null, uIFontWeight12, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                        chaloTextStyleHelper6 = chaloTextStyleHelper115;
                                        coroutineSingletons4 = coroutineSingletons3;
                                        stringProvider7 = stringProvider6;
                                        j19 = j18;
                                        priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC114, chaloTextUIStateC115, null, 9), EmptyList.f17557a, null);
                                        if (z3) {
                                            switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                                case 1:
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    j21 = j19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                                    stringProvider8 = stringProvider7;
                                                    objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons5 = coroutineSingletons4;
                                                    if (objB9 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    priceDetailsUIState2 = priceDetailsUIState;
                                                    obj11 = objB9;
                                                    chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                                    CoroutineSingletons coroutineSingletons1110 = coroutineSingletons5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                                    bookingDetailsUIState5 = bookingDetailsUIState4;
                                                    stringProvider7 = stringProvider8;
                                                    objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                                    coroutineSingletons4 = coroutineSingletons1110;
                                                    if (objB10 == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    bookingDetailsUIState6 = bookingDetailsUIState5;
                                                    priceDetailsUIState3 = priceDetailsUIState2;
                                                    List list19 = list5;
                                                    chaloTextUIState = chaloTextUIStateC;
                                                    obj12 = objB10;
                                                    j22 = j21;
                                                    chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                                    list6 = list19;
                                                    TicketSupportUIState ticketSupportUIState14 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                                    list5 = list6;
                                                    str14 = str14;
                                                    priceDetailsUIState = priceDetailsUIState3;
                                                    j20 = j22;
                                                    ticketSupportUIState = ticketSupportUIState14;
                                                    bookingDetailsUIState4 = bookingDetailsUIState6;
                                                    MetroTicketAppModel metroTicketAppModel113 = metroTicketBooking8.d;
                                                    String str111110 = str14;
                                                    Map map113 = metroTicketAppModel113.l;
                                                    Function1 function2114 = function1;
                                                    chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                                    long j2115 = metroTicketAppModel113.k;
                                                    boolean z117 = !metroTicketAppModel113.h(j20);
                                                    Long l113 = new Long(j2115);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                                    productSummaryStatusUiData = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                                    ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$115 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                                    objA = a(productReceiptData3, metroTicketBooking8, map113, str111110, l113, EmptyList.f17557a, z117, function2114, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$115);
                                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$115;
                                                    if (objA == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    priceDetailsUIState4 = priceDetailsUIState;
                                                    obj13 = objA;
                                                    bookingDetailsUIState7 = bookingDetailsUIState4;
                                                    list7 = list5;
                                                    toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                    ticketSupportUIState2 = ticketSupportUIState;
                                                    ticketInfoUIState = (TicketInfoUIState) obj13;
                                                    if (productReceiptData3 == null) {
                                                        break;
                                                    }
                                                    ticketInfoUIState2 = ticketInfoUIState;
                                                    priceDetailsUIState5 = priceDetailsUIState4;
                                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    j20 = j19;
                                                    break;
                                                default:
                                                    throw new NoWhenBranchMatchedException();
                                            }
                                        } else {
                                            j20 = j19;
                                        }
                                        ticketSupportUIState = null;
                                        MetroTicketAppModel metroTicketAppModel114 = metroTicketBooking8.d;
                                        String str111111 = str14;
                                        Map map114 = metroTicketAppModel114.l;
                                        Function1 function2115 = function1;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                        long j2116 = metroTicketAppModel114.k;
                                        boolean z118 = !metroTicketAppModel114.h(j20);
                                        Long l114 = new Long(j2116);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                        productSummaryStatusUiData = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$116 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                        objA = a(productReceiptData3, metroTicketBooking8, map114, str111111, l114, EmptyList.f17557a, z118, function2115, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$116);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$116;
                                        if (objA == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        priceDetailsUIState4 = priceDetailsUIState;
                                        obj13 = objA;
                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                        list7 = list5;
                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                        ticketSupportUIState2 = ticketSupportUIState;
                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                        if (productReceiptData3 == null) {
                                            break;
                                        }
                                        ticketInfoUIState2 = ticketInfoUIState;
                                        priceDetailsUIState5 = priceDetailsUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        return coroutineSingletons6;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 2:
                long j31 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                boolean z20 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0;
                BusTicketStatusSpec busTicketStatusSpec11 = (BusTicketStatusSpec) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7;
                ToolbarUIState toolbarUIState9 = (ToolbarUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                Function1 function32 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                Function1 function33 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                Function1 function34 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                String str20 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                ProductReceiptData productReceiptData5 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking9 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                metroTicketBooking3 = metroTicketBooking9;
                almostBlackColor = almostBlackColor2;
                chaloTextStyleHelper3 = chaloTextStyleHelper11;
                function4 = function32;
                function6 = function33;
                function5 = function34;
                str4 = str20;
                obj2 = obj13;
                coroutineSingletons = coroutineSingletons6;
                toolbarUIState2 = toolbarUIState9;
                stringProvider = stringProvider9;
                j4 = j31;
                busTicketStatusSpec2 = busTicketStatusSpec11;
                z2 = z20;
                productReceiptData2 = productReceiptData5;
                amountAddedText = amountAddedText3;
                busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec2, new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.TitleLarge, amountAddedText, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
                metroTicketBooking2 = metroTicketBooking3;
                toolbarUIState4 = toolbarUIState2;
                function12 = function6;
                function1 = function5;
                str9 = str4;
                j9 = j4;
                function3 = function4;
                toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                productSummaryUIStateFactory = this;
                objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                if (objD != coroutineSingletons) {
                    str14 = str9;
                    metroTicketBooking8 = metroTicketBooking2;
                    obj7 = objD;
                    toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                    productReceiptData3 = productReceiptData2;
                    list = (List) obj7;
                    String str111112 = metroTicketBooking8.d.f5431a;
                    if (productReceiptData3 != null) {
                        strR = productReceiptData3.r();
                    } else {
                        strR = null;
                    }
                    stringProvider4 = stringProvider;
                    String strA14 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                    j14 = j9;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                    objB6 = productSummaryUIStateFactory.b(str111112, strR, strA14, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                    coroutineSingletons = coroutineSingletons;
                    if (objB6 != coroutineSingletons) {
                        function19 = function12;
                        list2 = list;
                        obj8 = objB6;
                        bookingDetailsUIState = (BookingDetailsUIState) obj8;
                        j15 = j14;
                        strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                        chaloTextStyleHelper11 = chaloTextStyleHelper3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        list3 = list2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                        stringProvider5 = stringProvider4;
                        objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        if (objB7 != coroutineSingletons) {
                            bookingDetailsUIState2 = bookingDetailsUIState;
                            obj9 = objB7;
                            str15 = strA;
                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                            chaloTextStyleHelper4 = chaloTextStyleHelper11;
                            j16 = j15;
                            list4 = list3;
                            CoroutineSingletons coroutineSingletons1111 = coroutineSingletons;
                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                            j17 = j16;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            bookingDetailsUIState3 = bookingDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                            stringProvider6 = stringProvider5;
                            objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons3 = coroutineSingletons1111;
                            if (objB8 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            obj10 = objB8;
                            z3 = z2;
                            bookingDetailsUIState4 = bookingDetailsUIState3;
                            chaloTextStyleHelper5 = chaloTextStyleHelper11;
                            list5 = list4;
                            toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                            j18 = j17;
                            UIFontWeight uIFontWeight13 = UIFontWeight.SemiBold;
                            TextUIState.ChaloTextUIState chaloTextUIStateC116 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight13, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            ChaloTextStyleHelper chaloTextStyleHelper116 = chaloTextStyleHelper11;
                            TextUIState.ChaloTextUIState chaloTextUIStateC117 = ChaloTextStyleHelper.c(chaloTextStyleHelper116, str15, null, null, uIFontWeight13, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            chaloTextStyleHelper6 = chaloTextStyleHelper116;
                            coroutineSingletons4 = coroutineSingletons3;
                            stringProvider7 = stringProvider6;
                            j19 = j18;
                            priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC116, chaloTextUIStateC117, null, 9), EmptyList.f17557a, null);
                            if (z3) {
                                switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                    case 1:
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        j21 = j19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                        stringProvider8 = stringProvider7;
                                        objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons5 = coroutineSingletons4;
                                        if (objB9 == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        priceDetailsUIState2 = priceDetailsUIState;
                                        obj11 = objB9;
                                        chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                        CoroutineSingletons coroutineSingletons1112 = coroutineSingletons5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                        bookingDetailsUIState5 = bookingDetailsUIState4;
                                        stringProvider7 = stringProvider8;
                                        objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons4 = coroutineSingletons1112;
                                        if (objB10 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        bookingDetailsUIState6 = bookingDetailsUIState5;
                                        priceDetailsUIState3 = priceDetailsUIState2;
                                        List list110 = list5;
                                        chaloTextUIState = chaloTextUIStateC;
                                        obj12 = objB10;
                                        j22 = j21;
                                        chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                        list6 = list110;
                                        TicketSupportUIState ticketSupportUIState15 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                        list5 = list6;
                                        str14 = str14;
                                        priceDetailsUIState = priceDetailsUIState3;
                                        j20 = j22;
                                        ticketSupportUIState = ticketSupportUIState15;
                                        bookingDetailsUIState4 = bookingDetailsUIState6;
                                        MetroTicketAppModel metroTicketAppModel115 = metroTicketBooking8.d;
                                        String str111113 = str14;
                                        Map map115 = metroTicketAppModel115.l;
                                        Function1 function2116 = function1;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                        long j2117 = metroTicketAppModel115.k;
                                        boolean z119 = !metroTicketAppModel115.h(j20);
                                        Long l115 = new Long(j2117);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                        productSummaryStatusUiData = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$117 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                        objA = a(productReceiptData3, metroTicketBooking8, map115, str111113, l115, EmptyList.f17557a, z119, function2116, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$117);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$117;
                                        if (objA == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        priceDetailsUIState4 = priceDetailsUIState;
                                        obj13 = objA;
                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                        list7 = list5;
                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                        ticketSupportUIState2 = ticketSupportUIState;
                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                        if (productReceiptData3 == null) {
                                            break;
                                        }
                                        ticketInfoUIState2 = ticketInfoUIState;
                                        priceDetailsUIState5 = priceDetailsUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                        j20 = j19;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                j20 = j19;
                            }
                            ticketSupportUIState = null;
                            MetroTicketAppModel metroTicketAppModel116 = metroTicketBooking8.d;
                            String str111114 = str14;
                            Map map116 = metroTicketAppModel116.l;
                            Function1 function2117 = function1;
                            chaloTextStyleHelper9 = chaloTextStyleHelper6;
                            long j2118 = metroTicketAppModel116.k;
                            boolean z1110 = !metroTicketAppModel116.h(j20);
                            Long l116 = new Long(j2118);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                            productSummaryStatusUiData = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                            ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$118 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                            objA = a(productReceiptData3, metroTicketBooking8, map116, str111114, l116, EmptyList.f17557a, z1110, function2117, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$118);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$118;
                            if (objA == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            priceDetailsUIState4 = priceDetailsUIState;
                            obj13 = objA;
                            bookingDetailsUIState7 = bookingDetailsUIState4;
                            list7 = list5;
                            toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                            ticketSupportUIState2 = ticketSupportUIState;
                            ticketInfoUIState = (TicketInfoUIState) obj13;
                            if (productReceiptData3 == null) {
                                break;
                            }
                            ticketInfoUIState2 = ticketInfoUIState;
                            priceDetailsUIState5 = priceDetailsUIState4;
                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                long j32 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                boolean z21 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0;
                BusTicketStatusSpec busTicketStatusSpec12 = (BusTicketStatusSpec) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7;
                ToolbarUIState toolbarUIState10 = (ToolbarUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                Function1 function35 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                Function1 function36 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                Function1 function37 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                String str21 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                ProductReceiptData productReceiptData6 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking10 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                metroTicketBooking4 = metroTicketBooking10;
                almostBlackColor = almostBlackColor2;
                chaloTextStyleHelper3 = chaloTextStyleHelper11;
                function7 = function35;
                function9 = function36;
                function8 = function37;
                str6 = str21;
                obj3 = obj13;
                coroutineSingletons = coroutineSingletons6;
                j6 = j32;
                toolbarUIState = toolbarUIState10;
                productReceiptData2 = productReceiptData6;
                busTicketStatusSpec4 = busTicketStatusSpec12;
                z2 = z21;
                busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec4, new TextUIState.ChaloTextUIState((String) obj3, UITextStyle.TitleLarge, amountAddedText3, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_GREEN_TICK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                metroTicketBooking2 = metroTicketBooking4;
                function3 = function7;
                function12 = function9;
                function1 = function8;
                str9 = str6;
                toolbarUIState4 = toolbarUIState;
                j9 = j6;
                stringProvider = stringProvider9;
                toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                productSummaryUIStateFactory = this;
                objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                if (objD != coroutineSingletons) {
                    str14 = str9;
                    metroTicketBooking8 = metroTicketBooking2;
                    obj7 = objD;
                    toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                    productReceiptData3 = productReceiptData2;
                    list = (List) obj7;
                    String str111115 = metroTicketBooking8.d.f5431a;
                    if (productReceiptData3 != null) {
                        strR = productReceiptData3.r();
                    } else {
                        strR = null;
                    }
                    stringProvider4 = stringProvider;
                    String strA15 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                    j14 = j9;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                    objB6 = productSummaryUIStateFactory.b(str111115, strR, strA15, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                    coroutineSingletons = coroutineSingletons;
                    if (objB6 != coroutineSingletons) {
                        function19 = function12;
                        list2 = list;
                        obj8 = objB6;
                        bookingDetailsUIState = (BookingDetailsUIState) obj8;
                        j15 = j14;
                        strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                        chaloTextStyleHelper11 = chaloTextStyleHelper3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        list3 = list2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                        stringProvider5 = stringProvider4;
                        objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        if (objB7 != coroutineSingletons) {
                            bookingDetailsUIState2 = bookingDetailsUIState;
                            obj9 = objB7;
                            str15 = strA;
                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                            chaloTextStyleHelper4 = chaloTextStyleHelper11;
                            j16 = j15;
                            list4 = list3;
                            CoroutineSingletons coroutineSingletons1113 = coroutineSingletons;
                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                            j17 = j16;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            bookingDetailsUIState3 = bookingDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                            stringProvider6 = stringProvider5;
                            objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons3 = coroutineSingletons1113;
                            if (objB8 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            obj10 = objB8;
                            z3 = z2;
                            bookingDetailsUIState4 = bookingDetailsUIState3;
                            chaloTextStyleHelper5 = chaloTextStyleHelper11;
                            list5 = list4;
                            toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                            j18 = j17;
                            UIFontWeight uIFontWeight14 = UIFontWeight.SemiBold;
                            TextUIState.ChaloTextUIState chaloTextUIStateC118 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight14, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            ChaloTextStyleHelper chaloTextStyleHelper117 = chaloTextStyleHelper11;
                            TextUIState.ChaloTextUIState chaloTextUIStateC119 = ChaloTextStyleHelper.c(chaloTextStyleHelper117, str15, null, null, uIFontWeight14, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            chaloTextStyleHelper6 = chaloTextStyleHelper117;
                            coroutineSingletons4 = coroutineSingletons3;
                            stringProvider7 = stringProvider6;
                            j19 = j18;
                            priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC118, chaloTextUIStateC119, null, 9), EmptyList.f17557a, null);
                            if (z3) {
                                switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                    case 1:
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        j21 = j19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                        stringProvider8 = stringProvider7;
                                        objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons5 = coroutineSingletons4;
                                        if (objB9 == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        priceDetailsUIState2 = priceDetailsUIState;
                                        obj11 = objB9;
                                        chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                        CoroutineSingletons coroutineSingletons1114 = coroutineSingletons5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                        bookingDetailsUIState5 = bookingDetailsUIState4;
                                        stringProvider7 = stringProvider8;
                                        objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons4 = coroutineSingletons1114;
                                        if (objB10 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        bookingDetailsUIState6 = bookingDetailsUIState5;
                                        priceDetailsUIState3 = priceDetailsUIState2;
                                        List list111 = list5;
                                        chaloTextUIState = chaloTextUIStateC;
                                        obj12 = objB10;
                                        j22 = j21;
                                        chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                        list6 = list111;
                                        TicketSupportUIState ticketSupportUIState16 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                        list5 = list6;
                                        str14 = str14;
                                        priceDetailsUIState = priceDetailsUIState3;
                                        j20 = j22;
                                        ticketSupportUIState = ticketSupportUIState16;
                                        bookingDetailsUIState4 = bookingDetailsUIState6;
                                        MetroTicketAppModel metroTicketAppModel117 = metroTicketBooking8.d;
                                        String str111116 = str14;
                                        Map map117 = metroTicketAppModel117.l;
                                        Function1 function2118 = function1;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                        long j2119 = metroTicketAppModel117.k;
                                        boolean z1111 = !metroTicketAppModel117.h(j20);
                                        Long l117 = new Long(j2119);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                        productSummaryStatusUiData = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$119 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                        objA = a(productReceiptData3, metroTicketBooking8, map117, str111116, l117, EmptyList.f17557a, z1111, function2118, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$119);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$119;
                                        if (objA == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        priceDetailsUIState4 = priceDetailsUIState;
                                        obj13 = objA;
                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                        list7 = list5;
                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                        ticketSupportUIState2 = ticketSupportUIState;
                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                        if (productReceiptData3 == null) {
                                            break;
                                        }
                                        ticketInfoUIState2 = ticketInfoUIState;
                                        priceDetailsUIState5 = priceDetailsUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                        j20 = j19;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                j20 = j19;
                            }
                            ticketSupportUIState = null;
                            MetroTicketAppModel metroTicketAppModel118 = metroTicketBooking8.d;
                            String str111117 = str14;
                            Map map118 = metroTicketAppModel118.l;
                            Function1 function2119 = function1;
                            chaloTextStyleHelper9 = chaloTextStyleHelper6;
                            long j21110 = metroTicketAppModel118.k;
                            boolean z1112 = !metroTicketAppModel118.h(j20);
                            Long l118 = new Long(j21110);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                            productSummaryStatusUiData = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                            ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1110 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                            objA = a(productReceiptData3, metroTicketBooking8, map118, str111117, l118, EmptyList.f17557a, z1112, function2119, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1110);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1110;
                            if (objA == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            priceDetailsUIState4 = priceDetailsUIState;
                            obj13 = objA;
                            bookingDetailsUIState7 = bookingDetailsUIState4;
                            list7 = list5;
                            toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                            ticketSupportUIState2 = ticketSupportUIState;
                            ticketInfoUIState = (TicketInfoUIState) obj13;
                            if (productReceiptData3 == null) {
                                break;
                            }
                            ticketInfoUIState2 = ticketInfoUIState;
                            priceDetailsUIState5 = priceDetailsUIState4;
                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                long j33 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                boolean z22 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0;
                BusTicketStatusSpec busTicketStatusSpec13 = (BusTicketStatusSpec) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7;
                ToolbarUIState toolbarUIState11 = (ToolbarUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                Function1 function38 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                function2 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                Function1 function39 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                String str22 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                ProductReceiptData productReceiptData7 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking11 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                metroTicketBooking5 = metroTicketBooking11;
                j8 = j33;
                toolbarUIState3 = toolbarUIState11;
                almostBlackColor = almostBlackColor2;
                chaloTextStyleHelper3 = chaloTextStyleHelper11;
                function10 = function38;
                stringProvider2 = stringProvider9;
                function11 = function39;
                str8 = str22;
                obj4 = obj13;
                productReceiptData2 = productReceiptData7;
                coroutineSingletons2 = coroutineSingletons6;
                busTicketStatusSpec6 = busTicketStatusSpec13;
                z2 = z22;
                Function1 function2120 = function2;
                busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec6, new TextUIState.ChaloTextUIState((String) obj4, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                coroutineSingletons = coroutineSingletons2;
                j9 = j8;
                toolbarUIState4 = toolbarUIState3;
                function3 = function10;
                function1 = function11;
                str9 = str8;
                stringProvider = stringProvider2;
                metroTicketBooking2 = metroTicketBooking5;
                function12 = function2120;
                toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                productSummaryUIStateFactory = this;
                objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                if (objD != coroutineSingletons) {
                    str14 = str9;
                    metroTicketBooking8 = metroTicketBooking2;
                    obj7 = objD;
                    toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                    productReceiptData3 = productReceiptData2;
                    list = (List) obj7;
                    String str111118 = metroTicketBooking8.d.f5431a;
                    if (productReceiptData3 != null) {
                        strR = productReceiptData3.r();
                    } else {
                        strR = null;
                    }
                    stringProvider4 = stringProvider;
                    String strA16 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                    j14 = j9;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                    objB6 = productSummaryUIStateFactory.b(str111118, strR, strA16, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                    coroutineSingletons = coroutineSingletons;
                    if (objB6 != coroutineSingletons) {
                        function19 = function12;
                        list2 = list;
                        obj8 = objB6;
                        bookingDetailsUIState = (BookingDetailsUIState) obj8;
                        j15 = j14;
                        strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                        chaloTextStyleHelper11 = chaloTextStyleHelper3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        list3 = list2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                        stringProvider5 = stringProvider4;
                        objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        if (objB7 != coroutineSingletons) {
                            bookingDetailsUIState2 = bookingDetailsUIState;
                            obj9 = objB7;
                            str15 = strA;
                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                            chaloTextStyleHelper4 = chaloTextStyleHelper11;
                            j16 = j15;
                            list4 = list3;
                            CoroutineSingletons coroutineSingletons1115 = coroutineSingletons;
                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                            j17 = j16;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            bookingDetailsUIState3 = bookingDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                            stringProvider6 = stringProvider5;
                            objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons3 = coroutineSingletons1115;
                            if (objB8 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            obj10 = objB8;
                            z3 = z2;
                            bookingDetailsUIState4 = bookingDetailsUIState3;
                            chaloTextStyleHelper5 = chaloTextStyleHelper11;
                            list5 = list4;
                            toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                            j18 = j17;
                            UIFontWeight uIFontWeight15 = UIFontWeight.SemiBold;
                            TextUIState.ChaloTextUIState chaloTextUIStateC1110 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight15, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            ChaloTextStyleHelper chaloTextStyleHelper118 = chaloTextStyleHelper11;
                            TextUIState.ChaloTextUIState chaloTextUIStateC1111 = ChaloTextStyleHelper.c(chaloTextStyleHelper118, str15, null, null, uIFontWeight15, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            chaloTextStyleHelper6 = chaloTextStyleHelper118;
                            coroutineSingletons4 = coroutineSingletons3;
                            stringProvider7 = stringProvider6;
                            j19 = j18;
                            priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC1110, chaloTextUIStateC1111, null, 9), EmptyList.f17557a, null);
                            if (z3) {
                                switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                    case 1:
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        j21 = j19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                        stringProvider8 = stringProvider7;
                                        objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons5 = coroutineSingletons4;
                                        if (objB9 == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        priceDetailsUIState2 = priceDetailsUIState;
                                        obj11 = objB9;
                                        chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                        CoroutineSingletons coroutineSingletons1116 = coroutineSingletons5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                        bookingDetailsUIState5 = bookingDetailsUIState4;
                                        stringProvider7 = stringProvider8;
                                        objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons4 = coroutineSingletons1116;
                                        if (objB10 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        bookingDetailsUIState6 = bookingDetailsUIState5;
                                        priceDetailsUIState3 = priceDetailsUIState2;
                                        List list112 = list5;
                                        chaloTextUIState = chaloTextUIStateC;
                                        obj12 = objB10;
                                        j22 = j21;
                                        chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                        list6 = list112;
                                        TicketSupportUIState ticketSupportUIState17 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                        list5 = list6;
                                        str14 = str14;
                                        priceDetailsUIState = priceDetailsUIState3;
                                        j20 = j22;
                                        ticketSupportUIState = ticketSupportUIState17;
                                        bookingDetailsUIState4 = bookingDetailsUIState6;
                                        MetroTicketAppModel metroTicketAppModel119 = metroTicketBooking8.d;
                                        String str111119 = str14;
                                        Map map119 = metroTicketAppModel119.l;
                                        Function1 function21110 = function1;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                        long j21111 = metroTicketAppModel119.k;
                                        boolean z1113 = !metroTicketAppModel119.h(j20);
                                        Long l119 = new Long(j21111);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                        productSummaryStatusUiData = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1111 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                        objA = a(productReceiptData3, metroTicketBooking8, map119, str111119, l119, EmptyList.f17557a, z1113, function21110, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1111);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1111;
                                        if (objA == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        priceDetailsUIState4 = priceDetailsUIState;
                                        obj13 = objA;
                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                        list7 = list5;
                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                        ticketSupportUIState2 = ticketSupportUIState;
                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                        if (productReceiptData3 == null) {
                                            break;
                                        }
                                        ticketInfoUIState2 = ticketInfoUIState;
                                        priceDetailsUIState5 = priceDetailsUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                        j20 = j19;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                j20 = j19;
                            }
                            ticketSupportUIState = null;
                            MetroTicketAppModel metroTicketAppModel1110 = metroTicketBooking8.d;
                            String str1111110 = str14;
                            Map map1110 = metroTicketAppModel1110.l;
                            Function1 function21111 = function1;
                            chaloTextStyleHelper9 = chaloTextStyleHelper6;
                            long j21112 = metroTicketAppModel1110.k;
                            boolean z1114 = !metroTicketAppModel1110.h(j20);
                            Long l1110 = new Long(j21112);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                            productSummaryStatusUiData = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                            ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1112 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                            objA = a(productReceiptData3, metroTicketBooking8, map1110, str1111110, l1110, EmptyList.f17557a, z1114, function21111, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1112);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1112;
                            if (objA == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            priceDetailsUIState4 = priceDetailsUIState;
                            obj13 = objA;
                            bookingDetailsUIState7 = bookingDetailsUIState4;
                            list7 = list5;
                            toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                            ticketSupportUIState2 = ticketSupportUIState;
                            ticketInfoUIState = (TicketInfoUIState) obj13;
                            if (productReceiptData3 == null) {
                                break;
                            }
                            ticketInfoUIState2 = ticketInfoUIState;
                            priceDetailsUIState5 = priceDetailsUIState4;
                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                long j34 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                boolean z23 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0;
                BusTicketStatusSpec busTicketStatusSpec14 = (BusTicketStatusSpec) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7;
                ToolbarUIState toolbarUIState12 = (ToolbarUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                Function1 function40 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                Function1 function41 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                Function1 function42 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                String str23 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                ProductReceiptData productReceiptData8 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking12 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                metroTicketBooking6 = metroTicketBooking12;
                almostBlackColor = almostBlackColor2;
                chaloTextStyleHelper3 = chaloTextStyleHelper11;
                function13 = function40;
                function15 = function41;
                function14 = function42;
                str11 = str23;
                obj5 = obj13;
                busTicketStatusSpec8 = busTicketStatusSpec14;
                toolbarUIState5 = toolbarUIState12;
                z2 = z23;
                j11 = j34;
                stringProvider3 = stringProvider9;
                productReceiptData2 = productReceiptData8;
                amountAddedText2 = amountAddedText3;
                busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec8, new TextUIState.ChaloTextUIState((String) obj5, UITextStyle.TitleLarge, amountAddedText2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
                ToolbarUIState toolbarUIState13 = toolbarUIState5;
                coroutineSingletons = coroutineSingletons6;
                stringProvider = stringProvider3;
                toolbarUIState4 = toolbarUIState13;
                metroTicketBooking2 = metroTicketBooking6;
                j9 = j11;
                function3 = function13;
                function12 = function15;
                function1 = function14;
                str9 = str11;
                toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                productSummaryUIStateFactory = this;
                objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                if (objD != coroutineSingletons) {
                    str14 = str9;
                    metroTicketBooking8 = metroTicketBooking2;
                    obj7 = objD;
                    toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                    productReceiptData3 = productReceiptData2;
                    list = (List) obj7;
                    String str1111111 = metroTicketBooking8.d.f5431a;
                    if (productReceiptData3 != null) {
                        strR = productReceiptData3.r();
                    } else {
                        strR = null;
                    }
                    stringProvider4 = stringProvider;
                    String strA17 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                    j14 = j9;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                    objB6 = productSummaryUIStateFactory.b(str1111111, strR, strA17, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                    coroutineSingletons = coroutineSingletons;
                    if (objB6 != coroutineSingletons) {
                        function19 = function12;
                        list2 = list;
                        obj8 = objB6;
                        bookingDetailsUIState = (BookingDetailsUIState) obj8;
                        j15 = j14;
                        strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                        chaloTextStyleHelper11 = chaloTextStyleHelper3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        list3 = list2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                        stringProvider5 = stringProvider4;
                        objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        if (objB7 != coroutineSingletons) {
                            bookingDetailsUIState2 = bookingDetailsUIState;
                            obj9 = objB7;
                            str15 = strA;
                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                            chaloTextStyleHelper4 = chaloTextStyleHelper11;
                            j16 = j15;
                            list4 = list3;
                            CoroutineSingletons coroutineSingletons1117 = coroutineSingletons;
                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                            j17 = j16;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            bookingDetailsUIState3 = bookingDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                            stringProvider6 = stringProvider5;
                            objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons3 = coroutineSingletons1117;
                            if (objB8 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            obj10 = objB8;
                            z3 = z2;
                            bookingDetailsUIState4 = bookingDetailsUIState3;
                            chaloTextStyleHelper5 = chaloTextStyleHelper11;
                            list5 = list4;
                            toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                            j18 = j17;
                            UIFontWeight uIFontWeight16 = UIFontWeight.SemiBold;
                            TextUIState.ChaloTextUIState chaloTextUIStateC1112 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight16, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            ChaloTextStyleHelper chaloTextStyleHelper119 = chaloTextStyleHelper11;
                            TextUIState.ChaloTextUIState chaloTextUIStateC1113 = ChaloTextStyleHelper.c(chaloTextStyleHelper119, str15, null, null, uIFontWeight16, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            chaloTextStyleHelper6 = chaloTextStyleHelper119;
                            coroutineSingletons4 = coroutineSingletons3;
                            stringProvider7 = stringProvider6;
                            j19 = j18;
                            priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC1112, chaloTextUIStateC1113, null, 9), EmptyList.f17557a, null);
                            if (z3) {
                                switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                    case 1:
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        j21 = j19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                        stringProvider8 = stringProvider7;
                                        objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons5 = coroutineSingletons4;
                                        if (objB9 == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        priceDetailsUIState2 = priceDetailsUIState;
                                        obj11 = objB9;
                                        chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                        CoroutineSingletons coroutineSingletons1118 = coroutineSingletons5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                        bookingDetailsUIState5 = bookingDetailsUIState4;
                                        stringProvider7 = stringProvider8;
                                        objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons4 = coroutineSingletons1118;
                                        if (objB10 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        bookingDetailsUIState6 = bookingDetailsUIState5;
                                        priceDetailsUIState3 = priceDetailsUIState2;
                                        List list113 = list5;
                                        chaloTextUIState = chaloTextUIStateC;
                                        obj12 = objB10;
                                        j22 = j21;
                                        chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                        list6 = list113;
                                        TicketSupportUIState ticketSupportUIState18 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                        list5 = list6;
                                        str14 = str14;
                                        priceDetailsUIState = priceDetailsUIState3;
                                        j20 = j22;
                                        ticketSupportUIState = ticketSupportUIState18;
                                        bookingDetailsUIState4 = bookingDetailsUIState6;
                                        MetroTicketAppModel metroTicketAppModel1111 = metroTicketBooking8.d;
                                        String str1111112 = str14;
                                        Map map1111 = metroTicketAppModel1111.l;
                                        Function1 function21112 = function1;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                        long j21113 = metroTicketAppModel1111.k;
                                        boolean z1115 = !metroTicketAppModel1111.h(j20);
                                        Long l1111 = new Long(j21113);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                        productSummaryStatusUiData = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1113 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                        objA = a(productReceiptData3, metroTicketBooking8, map1111, str1111112, l1111, EmptyList.f17557a, z1115, function21112, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1113);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1113;
                                        if (objA == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        priceDetailsUIState4 = priceDetailsUIState;
                                        obj13 = objA;
                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                        list7 = list5;
                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                        ticketSupportUIState2 = ticketSupportUIState;
                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                        if (productReceiptData3 == null) {
                                            break;
                                        }
                                        ticketInfoUIState2 = ticketInfoUIState;
                                        priceDetailsUIState5 = priceDetailsUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                        j20 = j19;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                j20 = j19;
                            }
                            ticketSupportUIState = null;
                            MetroTicketAppModel metroTicketAppModel1112 = metroTicketBooking8.d;
                            String str1111113 = str14;
                            Map map1112 = metroTicketAppModel1112.l;
                            Function1 function21113 = function1;
                            chaloTextStyleHelper9 = chaloTextStyleHelper6;
                            long j21114 = metroTicketAppModel1112.k;
                            boolean z1116 = !metroTicketAppModel1112.h(j20);
                            Long l1112 = new Long(j21114);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                            productSummaryStatusUiData = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                            ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1114 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                            objA = a(productReceiptData3, metroTicketBooking8, map1112, str1111113, l1112, EmptyList.f17557a, z1116, function21113, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1114);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1114;
                            if (objA == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            priceDetailsUIState4 = priceDetailsUIState;
                            obj13 = objA;
                            bookingDetailsUIState7 = bookingDetailsUIState4;
                            list7 = list5;
                            toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                            ticketSupportUIState2 = ticketSupportUIState;
                            ticketInfoUIState = (TicketInfoUIState) obj13;
                            if (productReceiptData3 == null) {
                                break;
                            }
                            ticketInfoUIState2 = ticketInfoUIState;
                            priceDetailsUIState5 = priceDetailsUIState4;
                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                long j35 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                boolean z24 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0;
                BusTicketStatusSpec busTicketStatusSpec15 = (BusTicketStatusSpec) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7;
                ToolbarUIState toolbarUIState14 = (ToolbarUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                Function1 function43 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                Function1 function44 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                Function1 function45 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                String str24 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                ProductReceiptData productReceiptData9 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking13 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                str13 = str24;
                j13 = j35;
                almostBlackColor = almostBlackColor2;
                toolbarUIState6 = toolbarUIState14;
                function16 = function43;
                function18 = function44;
                function17 = function45;
                z2 = z24;
                productReceiptData2 = productReceiptData9;
                busTicketStatusSpec10 = busTicketStatusSpec15;
                metroTicketBooking7 = metroTicketBooking13;
                obj6 = obj13;
                chaloTextStyleHelper2 = chaloTextStyleHelper11;
                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                busTicketStatusUiState = new BusTicketStatusUiState(busTicketStatusSpec10, new TextUIState.ChaloTextUIState((String) obj6, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                coroutineSingletons = coroutineSingletons6;
                metroTicketBooking2 = metroTicketBooking7;
                str9 = str13;
                j9 = j13;
                toolbarUIState4 = toolbarUIState6;
                function3 = function16;
                function12 = function18;
                function1 = function17;
                stringProvider = stringProvider9;
                toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(toolbarUIState4, busTicketStatusUiState, 1);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str9;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j9;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 7;
                productSummaryUIStateFactory = this;
                objD = productSummaryUIStateFactory.f8788a.d(metroTicketBooking2, null, function3, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                if (objD != coroutineSingletons) {
                    str14 = str9;
                    metroTicketBooking8 = metroTicketBooking2;
                    obj7 = objD;
                    toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                    productReceiptData3 = productReceiptData2;
                    list = (List) obj7;
                    String str1111114 = metroTicketBooking8.d.f5431a;
                    if (productReceiptData3 != null) {
                        strR = productReceiptData3.r();
                    } else {
                        strR = null;
                    }
                    stringProvider4 = stringProvider;
                    String strA18 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                    j14 = j9;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                    objB6 = productSummaryUIStateFactory.b(str1111114, strR, strA18, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                    coroutineSingletons = coroutineSingletons;
                    if (objB6 != coroutineSingletons) {
                        function19 = function12;
                        list2 = list;
                        obj8 = objB6;
                        bookingDetailsUIState = (BookingDetailsUIState) obj8;
                        j15 = j14;
                        strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                        chaloTextStyleHelper11 = chaloTextStyleHelper3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        list3 = list2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                        stringProvider5 = stringProvider4;
                        objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        if (objB7 != coroutineSingletons) {
                            bookingDetailsUIState2 = bookingDetailsUIState;
                            obj9 = objB7;
                            str15 = strA;
                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                            chaloTextStyleHelper4 = chaloTextStyleHelper11;
                            j16 = j15;
                            list4 = list3;
                            CoroutineSingletons coroutineSingletons1119 = coroutineSingletons;
                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                            j17 = j16;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                            bookingDetailsUIState3 = bookingDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                            stringProvider6 = stringProvider5;
                            objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons3 = coroutineSingletons1119;
                            if (objB8 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            obj10 = objB8;
                            z3 = z2;
                            bookingDetailsUIState4 = bookingDetailsUIState3;
                            chaloTextStyleHelper5 = chaloTextStyleHelper11;
                            list5 = list4;
                            toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                            j18 = j17;
                            UIFontWeight uIFontWeight17 = UIFontWeight.SemiBold;
                            TextUIState.ChaloTextUIState chaloTextUIStateC1114 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight17, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            ChaloTextStyleHelper chaloTextStyleHelper1110 = chaloTextStyleHelper11;
                            TextUIState.ChaloTextUIState chaloTextUIStateC1115 = ChaloTextStyleHelper.c(chaloTextStyleHelper1110, str15, null, null, uIFontWeight17, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            chaloTextStyleHelper6 = chaloTextStyleHelper1110;
                            coroutineSingletons4 = coroutineSingletons3;
                            stringProvider7 = stringProvider6;
                            j19 = j18;
                            priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC1114, chaloTextUIStateC1115, null, 9), EmptyList.f17557a, null);
                            if (z3) {
                                switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                    case 1:
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        j21 = j19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                        stringProvider8 = stringProvider7;
                                        objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons5 = coroutineSingletons4;
                                        if (objB9 == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        priceDetailsUIState2 = priceDetailsUIState;
                                        obj11 = objB9;
                                        chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                        CoroutineSingletons coroutineSingletons11110 = coroutineSingletons5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                        bookingDetailsUIState5 = bookingDetailsUIState4;
                                        stringProvider7 = stringProvider8;
                                        objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                        coroutineSingletons4 = coroutineSingletons11110;
                                        if (objB10 == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        bookingDetailsUIState6 = bookingDetailsUIState5;
                                        priceDetailsUIState3 = priceDetailsUIState2;
                                        List list114 = list5;
                                        chaloTextUIState = chaloTextUIStateC;
                                        obj12 = objB10;
                                        j22 = j21;
                                        chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                        list6 = list114;
                                        TicketSupportUIState ticketSupportUIState19 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                        list5 = list6;
                                        str14 = str14;
                                        priceDetailsUIState = priceDetailsUIState3;
                                        j20 = j22;
                                        ticketSupportUIState = ticketSupportUIState19;
                                        bookingDetailsUIState4 = bookingDetailsUIState6;
                                        MetroTicketAppModel metroTicketAppModel1113 = metroTicketBooking8.d;
                                        String str1111115 = str14;
                                        Map map1113 = metroTicketAppModel1113.l;
                                        Function1 function21114 = function1;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                        long j21115 = metroTicketAppModel1113.k;
                                        boolean z1117 = !metroTicketAppModel1113.h(j20);
                                        Long l1113 = new Long(j21115);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                        productSummaryStatusUiData = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1115 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                        objA = a(productReceiptData3, metroTicketBooking8, map1113, str1111115, l1113, EmptyList.f17557a, z1117, function21114, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1115);
                                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1115;
                                        if (objA == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        priceDetailsUIState4 = priceDetailsUIState;
                                        obj13 = objA;
                                        bookingDetailsUIState7 = bookingDetailsUIState4;
                                        list7 = list5;
                                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                        ticketSupportUIState2 = ticketSupportUIState;
                                        ticketInfoUIState = (TicketInfoUIState) obj13;
                                        if (productReceiptData3 == null) {
                                            break;
                                        }
                                        ticketInfoUIState2 = ticketInfoUIState;
                                        priceDetailsUIState5 = priceDetailsUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                        j20 = j19;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                j20 = j19;
                            }
                            ticketSupportUIState = null;
                            MetroTicketAppModel metroTicketAppModel1114 = metroTicketBooking8.d;
                            String str1111116 = str14;
                            Map map1114 = metroTicketAppModel1114.l;
                            Function1 function21115 = function1;
                            chaloTextStyleHelper9 = chaloTextStyleHelper6;
                            long j21116 = metroTicketAppModel1114.k;
                            boolean z1118 = !metroTicketAppModel1114.h(j20);
                            Long l1114 = new Long(j21116);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                            productSummaryStatusUiData = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                            ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1116 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                            objA = a(productReceiptData3, metroTicketBooking8, map1114, str1111116, l1114, EmptyList.f17557a, z1118, function21115, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1116);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1116;
                            if (objA == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            priceDetailsUIState4 = priceDetailsUIState;
                            obj13 = objA;
                            bookingDetailsUIState7 = bookingDetailsUIState4;
                            list7 = list5;
                            toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                            ticketSupportUIState2 = ticketSupportUIState;
                            ticketInfoUIState = (TicketInfoUIState) obj13;
                            if (productReceiptData3 == null) {
                                break;
                            }
                            ticketInfoUIState2 = ticketInfoUIState;
                            priceDetailsUIState5 = priceDetailsUIState4;
                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                        }
                    }
                }
                return coroutineSingletons;
            case 7:
                long j36 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                boolean z25 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState6 = (ToolBarWithRightComponentUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                Function1 function46 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                function1 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                str14 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                productReceiptData3 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                metroTicketBooking8 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                almostBlackColor = almostBlackColor2;
                chaloTextStyleHelper3 = chaloTextStyleHelper11;
                j9 = j36;
                z2 = z25;
                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState6;
                obj7 = obj13;
                productSummaryUIStateFactory = this;
                function12 = function46;
                coroutineSingletons = coroutineSingletons6;
                stringProvider = stringProvider9;
                list = (List) obj7;
                String str1111117 = metroTicketBooking8.d.f5431a;
                if (productReceiptData3 != null) {
                    strR = productReceiptData3.r();
                } else {
                    strR = null;
                }
                stringProvider4 = stringProvider;
                String strA19 = TimeUtilsContract.DefaultImpls.a(productSummaryUIStateFactory.c, metroTicketBooking8.d.c, str14, 4);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function12;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                j14 = j9;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j14;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 8;
                objB6 = productSummaryUIStateFactory.b(str1111117, strR, strA19, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                coroutineSingletons = coroutineSingletons;
                if (objB6 != coroutineSingletons) {
                    function19 = function12;
                    list2 = list;
                    obj8 = objB6;
                    bookingDetailsUIState = (BookingDetailsUIState) obj8;
                    j15 = j14;
                    strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                    chaloTextStyleHelper11 = chaloTextStyleHelper3;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                    list3 = list2;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                    stringProvider5 = stringProvider4;
                    objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                    if (objB7 != coroutineSingletons) {
                        bookingDetailsUIState2 = bookingDetailsUIState;
                        obj9 = objB7;
                        str15 = strA;
                        toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                        chaloTextStyleHelper4 = chaloTextStyleHelper11;
                        j16 = j15;
                        list4 = list3;
                        CoroutineSingletons coroutineSingletons11111 = coroutineSingletons;
                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                        j17 = j16;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                        bookingDetailsUIState3 = bookingDetailsUIState2;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                        stringProvider6 = stringProvider5;
                        objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                        coroutineSingletons3 = coroutineSingletons11111;
                        if (objB8 == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        obj10 = objB8;
                        z3 = z2;
                        bookingDetailsUIState4 = bookingDetailsUIState3;
                        chaloTextStyleHelper5 = chaloTextStyleHelper11;
                        list5 = list4;
                        toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                        j18 = j17;
                        UIFontWeight uIFontWeight18 = UIFontWeight.SemiBold;
                        TextUIState.ChaloTextUIState chaloTextUIStateC1116 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight18, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        ChaloTextStyleHelper chaloTextStyleHelper1111 = chaloTextStyleHelper11;
                        TextUIState.ChaloTextUIState chaloTextUIStateC1117 = ChaloTextStyleHelper.c(chaloTextStyleHelper1111, str15, null, null, uIFontWeight18, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        chaloTextStyleHelper6 = chaloTextStyleHelper1111;
                        coroutineSingletons4 = coroutineSingletons3;
                        stringProvider7 = stringProvider6;
                        j19 = j18;
                        priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC1116, chaloTextUIStateC1117, null, 9), EmptyList.f17557a, null);
                        if (z3) {
                            switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                                case 1:
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                    j21 = j19;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                    stringProvider8 = stringProvider7;
                                    objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    coroutineSingletons5 = coroutineSingletons4;
                                    if (objB9 == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                    priceDetailsUIState2 = priceDetailsUIState;
                                    obj11 = objB9;
                                    chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                    CoroutineSingletons coroutineSingletons11112 = coroutineSingletons5;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                    bookingDetailsUIState5 = bookingDetailsUIState4;
                                    stringProvider7 = stringProvider8;
                                    objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                    coroutineSingletons4 = coroutineSingletons11112;
                                    if (objB10 == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    bookingDetailsUIState6 = bookingDetailsUIState5;
                                    priceDetailsUIState3 = priceDetailsUIState2;
                                    List list115 = list5;
                                    chaloTextUIState = chaloTextUIStateC;
                                    obj12 = objB10;
                                    j22 = j21;
                                    chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                    list6 = list115;
                                    TicketSupportUIState ticketSupportUIState110 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                    list5 = list6;
                                    str14 = str14;
                                    priceDetailsUIState = priceDetailsUIState3;
                                    j20 = j22;
                                    ticketSupportUIState = ticketSupportUIState110;
                                    bookingDetailsUIState4 = bookingDetailsUIState6;
                                    MetroTicketAppModel metroTicketAppModel1115 = metroTicketBooking8.d;
                                    String str1111118 = str14;
                                    Map map1115 = metroTicketAppModel1115.l;
                                    Function1 function21116 = function1;
                                    chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                    long j21117 = metroTicketAppModel1115.k;
                                    boolean z1119 = !metroTicketAppModel1115.h(j20);
                                    Long l1115 = new Long(j21117);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                    productSummaryStatusUiData = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                    ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1117 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                    objA = a(productReceiptData3, metroTicketBooking8, map1115, str1111118, l1115, EmptyList.f17557a, z1119, function21116, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1117);
                                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1117;
                                    if (objA == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    priceDetailsUIState4 = priceDetailsUIState;
                                    obj13 = objA;
                                    bookingDetailsUIState7 = bookingDetailsUIState4;
                                    list7 = list5;
                                    toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                    ticketSupportUIState2 = ticketSupportUIState;
                                    ticketInfoUIState = (TicketInfoUIState) obj13;
                                    if (productReceiptData3 == null) {
                                        break;
                                    }
                                    ticketInfoUIState2 = ticketInfoUIState;
                                    priceDetailsUIState5 = priceDetailsUIState4;
                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                    j20 = j19;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            j20 = j19;
                        }
                        ticketSupportUIState = null;
                        MetroTicketAppModel metroTicketAppModel1116 = metroTicketBooking8.d;
                        String str1111119 = str14;
                        Map map1116 = metroTicketAppModel1116.l;
                        Function1 function21117 = function1;
                        chaloTextStyleHelper9 = chaloTextStyleHelper6;
                        long j21118 = metroTicketAppModel1116.k;
                        boolean z11110 = !metroTicketAppModel1116.h(j20);
                        Long l1116 = new Long(j21118);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                        productSummaryStatusUiData = null;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                        ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1118 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                        objA = a(productReceiptData3, metroTicketBooking8, map1116, str1111119, l1116, EmptyList.f17557a, z11110, function21117, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1118);
                        productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1118;
                        if (objA == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                        priceDetailsUIState4 = priceDetailsUIState;
                        obj13 = objA;
                        bookingDetailsUIState7 = bookingDetailsUIState4;
                        list7 = list5;
                        toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                        ticketSupportUIState2 = ticketSupportUIState;
                        ticketInfoUIState = (TicketInfoUIState) obj13;
                        if (productReceiptData3 == null) {
                            break;
                        }
                        ticketInfoUIState2 = ticketInfoUIState;
                        priceDetailsUIState5 = priceDetailsUIState4;
                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                    }
                }
                return coroutineSingletons;
            case 8:
                long j37 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                boolean z26 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0;
                List list20 = (List) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                toolBarWithRightComponentUIState2 = (ToolBarWithRightComponentUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                Function1 function47 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                function1 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                str14 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                productReceiptData3 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                metroTicketBooking8 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                coroutineSingletons = coroutineSingletons6;
                function19 = function47;
                almostBlackColor = almostBlackColor2;
                chaloTextStyleHelper3 = chaloTextStyleHelper11;
                stringProvider4 = stringProvider9;
                j14 = j37;
                productSummaryUIStateFactory = this;
                list2 = list20;
                z2 = z26;
                obj8 = obj13;
                bookingDetailsUIState = (BookingDetailsUIState) obj8;
                j15 = j14;
                strA = productSummaryUIStateFactory.d.a(metroTicketBooking8.d.d, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = strA;
                chaloTextStyleHelper11 = chaloTextStyleHelper3;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper11;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                list3 = list2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j15;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 9;
                stringProvider5 = stringProvider4;
                objB7 = stringProvider5.b(StringEnum.PRICE_DETAILS, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                if (objB7 != coroutineSingletons) {
                    bookingDetailsUIState2 = bookingDetailsUIState;
                    obj9 = objB7;
                    str15 = strA;
                    toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                    chaloTextStyleHelper4 = chaloTextStyleHelper11;
                    j16 = j15;
                    list4 = list3;
                    CoroutineSingletons coroutineSingletons11113 = coroutineSingletons;
                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                    j17 = j16;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                    bookingDetailsUIState3 = bookingDetailsUIState2;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                    stringProvider6 = stringProvider5;
                    objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                    coroutineSingletons3 = coroutineSingletons11113;
                    if (objB8 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    obj10 = objB8;
                    z3 = z2;
                    bookingDetailsUIState4 = bookingDetailsUIState3;
                    chaloTextStyleHelper5 = chaloTextStyleHelper11;
                    list5 = list4;
                    toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                    j18 = j17;
                    UIFontWeight uIFontWeight19 = UIFontWeight.SemiBold;
                    TextUIState.ChaloTextUIState chaloTextUIStateC1118 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight19, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    ChaloTextStyleHelper chaloTextStyleHelper1112 = chaloTextStyleHelper11;
                    TextUIState.ChaloTextUIState chaloTextUIStateC1119 = ChaloTextStyleHelper.c(chaloTextStyleHelper1112, str15, null, null, uIFontWeight19, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    chaloTextStyleHelper6 = chaloTextStyleHelper1112;
                    coroutineSingletons4 = coroutineSingletons3;
                    stringProvider7 = stringProvider6;
                    j19 = j18;
                    priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC1118, chaloTextUIStateC1119, null, 9), EmptyList.f17557a, null);
                    if (z3) {
                        switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                            case 1:
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                j21 = j19;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                                stringProvider8 = stringProvider7;
                                objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                coroutineSingletons5 = coroutineSingletons4;
                                if (objB9 == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                                priceDetailsUIState2 = priceDetailsUIState;
                                obj11 = objB9;
                                chaloTextStyleHelper7 = chaloTextStyleHelper6;
                                chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                                CoroutineSingletons coroutineSingletons11114 = coroutineSingletons5;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                                bookingDetailsUIState5 = bookingDetailsUIState4;
                                stringProvider7 = stringProvider8;
                                objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                                coroutineSingletons4 = coroutineSingletons11114;
                                if (objB10 == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                bookingDetailsUIState6 = bookingDetailsUIState5;
                                priceDetailsUIState3 = priceDetailsUIState2;
                                List list116 = list5;
                                chaloTextUIState = chaloTextUIStateC;
                                obj12 = objB10;
                                j22 = j21;
                                chaloTextStyleHelper8 = chaloTextStyleHelper6;
                                list6 = list116;
                                TicketSupportUIState ticketSupportUIState111 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                                list5 = list6;
                                str14 = str14;
                                priceDetailsUIState = priceDetailsUIState3;
                                j20 = j22;
                                ticketSupportUIState = ticketSupportUIState111;
                                bookingDetailsUIState4 = bookingDetailsUIState6;
                                MetroTicketAppModel metroTicketAppModel1117 = metroTicketBooking8.d;
                                String str11111110 = str14;
                                Map map1117 = metroTicketAppModel1117.l;
                                Function1 function21118 = function1;
                                chaloTextStyleHelper9 = chaloTextStyleHelper6;
                                long j21119 = metroTicketAppModel1117.k;
                                boolean z11111 = !metroTicketAppModel1117.h(j20);
                                Long l1117 = new Long(j21119);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                                productSummaryStatusUiData = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                                ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1119 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                                objA = a(productReceiptData3, metroTicketBooking8, map1117, str11111110, l1117, EmptyList.f17557a, z11111, function21118, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1119);
                                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1119;
                                if (objA == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                priceDetailsUIState4 = priceDetailsUIState;
                                obj13 = objA;
                                bookingDetailsUIState7 = bookingDetailsUIState4;
                                list7 = list5;
                                toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                ticketSupportUIState2 = ticketSupportUIState;
                                ticketInfoUIState = (TicketInfoUIState) obj13;
                                if (productReceiptData3 == null) {
                                    break;
                                }
                                ticketInfoUIState2 = ticketInfoUIState;
                                priceDetailsUIState5 = priceDetailsUIState4;
                                productSummaryStatusUiData2 = productSummaryStatusUiData;
                                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                j20 = j19;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        j20 = j19;
                    }
                    ticketSupportUIState = null;
                    MetroTicketAppModel metroTicketAppModel1118 = metroTicketBooking8.d;
                    String str11111111 = str14;
                    Map map1118 = metroTicketAppModel1118.l;
                    Function1 function21119 = function1;
                    chaloTextStyleHelper9 = chaloTextStyleHelper6;
                    long j211110 = metroTicketAppModel1118.k;
                    boolean z11112 = !metroTicketAppModel1118.h(j20);
                    Long l1118 = new Long(j211110);
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                    productSummaryStatusUiData = null;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                    ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11110 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                    objA = a(productReceiptData3, metroTicketBooking8, map1118, str11111111, l1118, EmptyList.f17557a, z11112, function21119, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11110);
                    productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11110;
                    if (objA == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    priceDetailsUIState4 = priceDetailsUIState;
                    obj13 = objA;
                    bookingDetailsUIState7 = bookingDetailsUIState4;
                    list7 = list5;
                    toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                    ticketSupportUIState2 = ticketSupportUIState;
                    ticketInfoUIState = (TicketInfoUIState) obj13;
                    if (productReceiptData3 == null) {
                        break;
                    }
                    ticketInfoUIState2 = ticketInfoUIState;
                    priceDetailsUIState5 = priceDetailsUIState4;
                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                }
                return coroutineSingletons;
            case 9:
                long j38 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                boolean z27 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0;
                ChaloTextStyleHelper chaloTextStyleHelper20 = (ChaloTextStyleHelper) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9;
                String str25 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8;
                BookingDetailsUIState bookingDetailsUIState8 = (BookingDetailsUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7;
                List list21 = (List) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState7 = (ToolBarWithRightComponentUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                Function1 function48 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                Function1 function49 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                String str26 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                ProductReceiptData productReceiptData10 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking14 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                almostBlackColor = almostBlackColor2;
                stringProvider5 = stringProvider9;
                str15 = str25;
                j16 = j38;
                list4 = list21;
                toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState7;
                function1 = function49;
                str14 = str26;
                metroTicketBooking8 = metroTicketBooking14;
                bookingDetailsUIState2 = bookingDetailsUIState8;
                obj9 = obj13;
                coroutineSingletons = coroutineSingletons6;
                function19 = function48;
                productReceiptData3 = productReceiptData10;
                chaloTextStyleHelper4 = chaloTextStyleHelper20;
                z2 = z27;
                CoroutineSingletons coroutineSingletons11115 = coroutineSingletons;
                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper4, (String) obj9, almostBlackColor, null, null, 124);
                j17 = j16;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState3;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list4;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = str15;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextUIStateF;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextStyleHelper11;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0 = z2;
                bookingDetailsUIState3 = bookingDetailsUIState2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j17;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 10;
                stringProvider6 = stringProvider5;
                objB8 = stringProvider6.b(StringEnum.TOTAL, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                coroutineSingletons3 = coroutineSingletons11115;
                if (objB8 == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                obj10 = objB8;
                z3 = z2;
                bookingDetailsUIState4 = bookingDetailsUIState3;
                chaloTextStyleHelper5 = chaloTextStyleHelper11;
                list5 = list4;
                toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                j18 = j17;
                UIFontWeight uIFontWeight110 = UIFontWeight.SemiBold;
                TextUIState.ChaloTextUIState chaloTextUIStateC11110 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight110, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                ChaloTextStyleHelper chaloTextStyleHelper1113 = chaloTextStyleHelper11;
                TextUIState.ChaloTextUIState chaloTextUIStateC11111 = ChaloTextStyleHelper.c(chaloTextStyleHelper1113, str15, null, null, uIFontWeight110, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                chaloTextStyleHelper6 = chaloTextStyleHelper1113;
                coroutineSingletons4 = coroutineSingletons3;
                stringProvider7 = stringProvider6;
                j19 = j18;
                priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC11110, chaloTextUIStateC11111, null, 9), EmptyList.f17557a, null);
                if (z3) {
                    switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                        case 1:
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                            j21 = j19;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                            stringProvider8 = stringProvider7;
                            objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons5 = coroutineSingletons4;
                            if (objB9 == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            priceDetailsUIState2 = priceDetailsUIState;
                            obj11 = objB9;
                            chaloTextStyleHelper7 = chaloTextStyleHelper6;
                            chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                            CoroutineSingletons coroutineSingletons11116 = coroutineSingletons5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                            bookingDetailsUIState5 = bookingDetailsUIState4;
                            stringProvider7 = stringProvider8;
                            objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons4 = coroutineSingletons11116;
                            if (objB10 == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            bookingDetailsUIState6 = bookingDetailsUIState5;
                            priceDetailsUIState3 = priceDetailsUIState2;
                            List list117 = list5;
                            chaloTextUIState = chaloTextUIStateC;
                            obj12 = objB10;
                            j22 = j21;
                            chaloTextStyleHelper8 = chaloTextStyleHelper6;
                            list6 = list117;
                            TicketSupportUIState ticketSupportUIState112 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                            list5 = list6;
                            str14 = str14;
                            priceDetailsUIState = priceDetailsUIState3;
                            j20 = j22;
                            ticketSupportUIState = ticketSupportUIState112;
                            bookingDetailsUIState4 = bookingDetailsUIState6;
                            MetroTicketAppModel metroTicketAppModel1119 = metroTicketBooking8.d;
                            String str11111112 = str14;
                            Map map1119 = metroTicketAppModel1119.l;
                            Function1 function211110 = function1;
                            chaloTextStyleHelper9 = chaloTextStyleHelper6;
                            long j211111 = metroTicketAppModel1119.k;
                            boolean z11113 = !metroTicketAppModel1119.h(j20);
                            Long l1119 = new Long(j211111);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                            productSummaryStatusUiData = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                            ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11111 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                            objA = a(productReceiptData3, metroTicketBooking8, map1119, str11111112, l1119, EmptyList.f17557a, z11113, function211110, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11111);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11111;
                            if (objA == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            priceDetailsUIState4 = priceDetailsUIState;
                            obj13 = objA;
                            bookingDetailsUIState7 = bookingDetailsUIState4;
                            list7 = list5;
                            toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                            ticketSupportUIState2 = ticketSupportUIState;
                            ticketInfoUIState = (TicketInfoUIState) obj13;
                            if (productReceiptData3 == null) {
                                break;
                            }
                            ticketInfoUIState2 = ticketInfoUIState;
                            priceDetailsUIState5 = priceDetailsUIState4;
                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            j20 = j19;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j20 = j19;
                }
                ticketSupportUIState = null;
                MetroTicketAppModel metroTicketAppModel11110 = metroTicketBooking8.d;
                String str11111113 = str14;
                Map map11110 = metroTicketAppModel11110.l;
                Function1 function211111 = function1;
                chaloTextStyleHelper9 = chaloTextStyleHelper6;
                long j211112 = metroTicketAppModel11110.k;
                boolean z11114 = !metroTicketAppModel11110.h(j20);
                Long l11110 = new Long(j211112);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                productSummaryStatusUiData = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11112 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                objA = a(productReceiptData3, metroTicketBooking8, map11110, str11111113, l11110, EmptyList.f17557a, z11114, function211111, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11112);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11112;
                if (objA == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                priceDetailsUIState4 = priceDetailsUIState;
                obj13 = objA;
                bookingDetailsUIState7 = bookingDetailsUIState4;
                list7 = list5;
                toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                ticketSupportUIState2 = ticketSupportUIState;
                ticketInfoUIState = (TicketInfoUIState) obj13;
                if (productReceiptData3 == null) {
                    break;
                }
                ticketInfoUIState2 = ticketInfoUIState;
                priceDetailsUIState5 = priceDetailsUIState4;
                productSummaryStatusUiData2 = productSummaryStatusUiData;
                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
            case 10:
                j18 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                boolean z28 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.Z$0;
                ChaloTextStyleHelper chaloTextStyleHelper21 = (ChaloTextStyleHelper) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10;
                chaloTextUIStateF = (TextUIState.ChaloTextUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9;
                String str27 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8;
                BookingDetailsUIState bookingDetailsUIState9 = (BookingDetailsUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7;
                List list22 = (List) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState8 = (ToolBarWithRightComponentUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                Function1 function50 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                Function1 function51 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                String str28 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                ProductReceiptData productReceiptData11 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking15 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                almostBlackColor = almostBlackColor2;
                bookingDetailsUIState4 = bookingDetailsUIState9;
                toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState8;
                z3 = z28;
                str14 = str28;
                metroTicketBooking8 = metroTicketBooking15;
                chaloTextStyleHelper5 = chaloTextStyleHelper21;
                stringProvider6 = stringProvider9;
                coroutineSingletons3 = coroutineSingletons6;
                function19 = function50;
                str15 = str27;
                list5 = list22;
                function1 = function51;
                productReceiptData3 = productReceiptData11;
                obj10 = obj13;
                UIFontWeight uIFontWeight111 = UIFontWeight.SemiBold;
                TextUIState.ChaloTextUIState chaloTextUIStateC11112 = ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) obj10, null, null, uIFontWeight111, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                ChaloTextStyleHelper chaloTextStyleHelper1114 = chaloTextStyleHelper11;
                TextUIState.ChaloTextUIState chaloTextUIStateC11113 = ChaloTextStyleHelper.c(chaloTextStyleHelper1114, str15, null, null, uIFontWeight111, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                chaloTextStyleHelper6 = chaloTextStyleHelper1114;
                coroutineSingletons4 = coroutineSingletons3;
                stringProvider7 = stringProvider6;
                j19 = j18;
                priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF, new TitleSubtitleUiState(null, chaloTextUIStateC11112, chaloTextUIStateC11113, null, 9), EmptyList.f17557a, null);
                if (z3) {
                    switch (WhenMappings.f8789a[metroTicketBooking8.d.e.ordinal()]) {
                        case 1:
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                            j21 = j19;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 11;
                            stringProvider8 = stringProvider7;
                            objB9 = stringProvider8.b(StringEnum.FACING_ANY_DIFFICULTY, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons5 = coroutineSingletons4;
                            if (objB9 == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            priceDetailsUIState2 = priceDetailsUIState;
                            obj11 = objB9;
                            chaloTextStyleHelper7 = chaloTextStyleHelper6;
                            chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                            CoroutineSingletons coroutineSingletons11117 = coroutineSingletons5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                            bookingDetailsUIState5 = bookingDetailsUIState4;
                            stringProvider7 = stringProvider8;
                            objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                            coroutineSingletons4 = coroutineSingletons11117;
                            if (objB10 == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            bookingDetailsUIState6 = bookingDetailsUIState5;
                            priceDetailsUIState3 = priceDetailsUIState2;
                            List list118 = list5;
                            chaloTextUIState = chaloTextUIStateC;
                            obj12 = objB10;
                            j22 = j21;
                            chaloTextStyleHelper8 = chaloTextStyleHelper6;
                            list6 = list118;
                            TicketSupportUIState ticketSupportUIState113 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                            list5 = list6;
                            str14 = str14;
                            priceDetailsUIState = priceDetailsUIState3;
                            j20 = j22;
                            ticketSupportUIState = ticketSupportUIState113;
                            bookingDetailsUIState4 = bookingDetailsUIState6;
                            MetroTicketAppModel metroTicketAppModel11111 = metroTicketBooking8.d;
                            String str11111114 = str14;
                            Map map11111 = metroTicketAppModel11111.l;
                            Function1 function211112 = function1;
                            chaloTextStyleHelper9 = chaloTextStyleHelper6;
                            long j211113 = metroTicketAppModel11111.k;
                            boolean z11115 = !metroTicketAppModel11111.h(j20);
                            Long l11111 = new Long(j211113);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                            productSummaryStatusUiData = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                            ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11113 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                            objA = a(productReceiptData3, metroTicketBooking8, map11111, str11111114, l11111, EmptyList.f17557a, z11115, function211112, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11113);
                            productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11113;
                            if (objA == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            priceDetailsUIState4 = priceDetailsUIState;
                            obj13 = objA;
                            bookingDetailsUIState7 = bookingDetailsUIState4;
                            list7 = list5;
                            toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                            ticketSupportUIState2 = ticketSupportUIState;
                            ticketInfoUIState = (TicketInfoUIState) obj13;
                            if (productReceiptData3 == null) {
                                break;
                            }
                            ticketInfoUIState2 = ticketInfoUIState;
                            priceDetailsUIState5 = priceDetailsUIState4;
                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            j20 = j19;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j20 = j19;
                }
                ticketSupportUIState = null;
                MetroTicketAppModel metroTicketAppModel11112 = metroTicketBooking8.d;
                String str11111115 = str14;
                Map map11112 = metroTicketAppModel11112.l;
                Function1 function211113 = function1;
                chaloTextStyleHelper9 = chaloTextStyleHelper6;
                long j211114 = metroTicketAppModel11112.k;
                boolean z11116 = !metroTicketAppModel11112.h(j20);
                Long l11112 = new Long(j211114);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                productSummaryStatusUiData = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11114 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                objA = a(productReceiptData3, metroTicketBooking8, map11112, str11111115, l11112, EmptyList.f17557a, z11116, function211113, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11114);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11114;
                if (objA == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                priceDetailsUIState4 = priceDetailsUIState;
                obj13 = objA;
                bookingDetailsUIState7 = bookingDetailsUIState4;
                list7 = list5;
                toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                ticketSupportUIState2 = ticketSupportUIState;
                ticketInfoUIState = (TicketInfoUIState) obj13;
                if (productReceiptData3 == null) {
                    break;
                }
                ticketInfoUIState2 = ticketInfoUIState;
                priceDetailsUIState5 = priceDetailsUIState4;
                productSummaryStatusUiData2 = productSummaryStatusUiData;
                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
            case 11:
                long j39 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                ChaloTextStyleHelper chaloTextStyleHelper22 = (ChaloTextStyleHelper) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9;
                PriceDetailsUIState priceDetailsUIState7 = (PriceDetailsUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8;
                BookingDetailsUIState bookingDetailsUIState10 = (BookingDetailsUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7;
                List list23 = (List) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState9 = (ToolBarWithRightComponentUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                Function1 function52 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                Function1 function53 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                String str29 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                chaloTextStyleHelper7 = chaloTextStyleHelper22;
                ProductReceiptData productReceiptData12 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking16 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                bookingDetailsUIState4 = bookingDetailsUIState10;
                almostBlackColor = almostBlackColor2;
                toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState9;
                stringProvider8 = stringProvider9;
                function1 = function53;
                productReceiptData3 = productReceiptData12;
                chaloTextStyleHelper6 = chaloTextStyleHelper11;
                metroTicketBooking8 = metroTicketBooking16;
                obj11 = obj13;
                coroutineSingletons5 = coroutineSingletons6;
                priceDetailsUIState2 = priceDetailsUIState7;
                list5 = list23;
                function19 = function52;
                str14 = str29;
                j21 = j39;
                chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) obj11, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                CoroutineSingletons coroutineSingletons11118 = coroutineSingletons5;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = str14;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = function1;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = function19;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = list5;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = bookingDetailsUIState4;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = priceDetailsUIState2;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = chaloTextStyleHelper6;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = chaloTextUIStateC;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0 = j21;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 12;
                bookingDetailsUIState5 = bookingDetailsUIState4;
                stringProvider7 = stringProvider8;
                objB10 = stringProvider7.b(StringEnum.HELP, new Object[0], productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1);
                coroutineSingletons4 = coroutineSingletons11118;
                if (objB10 == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                bookingDetailsUIState6 = bookingDetailsUIState5;
                priceDetailsUIState3 = priceDetailsUIState2;
                List list119 = list5;
                chaloTextUIState = chaloTextUIStateC;
                obj12 = objB10;
                j22 = j21;
                chaloTextStyleHelper8 = chaloTextStyleHelper6;
                list6 = list119;
                TicketSupportUIState ticketSupportUIState114 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                list5 = list6;
                str14 = str14;
                priceDetailsUIState = priceDetailsUIState3;
                j20 = j22;
                ticketSupportUIState = ticketSupportUIState114;
                bookingDetailsUIState4 = bookingDetailsUIState6;
                MetroTicketAppModel metroTicketAppModel11113 = metroTicketBooking8.d;
                String str11111116 = str14;
                Map map11113 = metroTicketAppModel11113.l;
                Function1 function211114 = function1;
                chaloTextStyleHelper9 = chaloTextStyleHelper6;
                long j211115 = metroTicketAppModel11113.k;
                boolean z11117 = !metroTicketAppModel11113.h(j20);
                Long l11113 = new Long(j211115);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                productSummaryStatusUiData = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11115 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                objA = a(productReceiptData3, metroTicketBooking8, map11113, str11111116, l11113, EmptyList.f17557a, z11117, function211114, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11115);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11115;
                if (objA == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                priceDetailsUIState4 = priceDetailsUIState;
                obj13 = objA;
                bookingDetailsUIState7 = bookingDetailsUIState4;
                list7 = list5;
                toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                ticketSupportUIState2 = ticketSupportUIState;
                ticketInfoUIState = (TicketInfoUIState) obj13;
                if (productReceiptData3 == null) {
                    break;
                }
                ticketInfoUIState2 = ticketInfoUIState;
                priceDetailsUIState5 = priceDetailsUIState4;
                productSummaryStatusUiData2 = productSummaryStatusUiData;
                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
            case 12:
                j22 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.J$0;
                chaloTextUIState = (TextUIState.ChaloTextUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10;
                ChaloTextStyleHelper chaloTextStyleHelper23 = (ChaloTextStyleHelper) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9;
                PriceDetailsUIState priceDetailsUIState8 = (PriceDetailsUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8;
                BookingDetailsUIState bookingDetailsUIState11 = (BookingDetailsUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7;
                List list24 = (List) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState10 = (ToolBarWithRightComponentUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                Function1 function54 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                Function1 function55 = (Function1) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                String str30 = (String) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                ProductReceiptData productReceiptData13 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                ChaloUserBookingType.TicketBooking.MetroTicketBooking metroTicketBooking17 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                almostBlackColor = almostBlackColor2;
                stringProvider7 = stringProvider9;
                priceDetailsUIState3 = priceDetailsUIState8;
                bookingDetailsUIState6 = bookingDetailsUIState11;
                productReceiptData3 = productReceiptData13;
                metroTicketBooking8 = metroTicketBooking17;
                toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState10;
                chaloTextStyleHelper6 = chaloTextStyleHelper11;
                chaloTextStyleHelper8 = chaloTextStyleHelper23;
                list6 = list24;
                obj12 = obj13;
                str14 = str30;
                coroutineSingletons4 = coroutineSingletons6;
                function19 = function54;
                function1 = function55;
                TicketSupportUIState ticketSupportUIState115 = new TicketSupportUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper8, (String) obj12, ChaloColorToken.Orange2.f9830a, 0, null, UIFontWeight.SemiBold, UiEventHandler.Companion.a(new fr0(19, function19, metroTicketBooking8)), null, 76));
                list5 = list6;
                str14 = str14;
                priceDetailsUIState = priceDetailsUIState3;
                j20 = j22;
                ticketSupportUIState = ticketSupportUIState115;
                bookingDetailsUIState4 = bookingDetailsUIState6;
                MetroTicketAppModel metroTicketAppModel11114 = metroTicketBooking8.d;
                String str11111117 = str14;
                Map map11114 = metroTicketAppModel11114.l;
                Function1 function211115 = function1;
                chaloTextStyleHelper9 = chaloTextStyleHelper6;
                long j211116 = metroTicketAppModel11114.k;
                boolean z11118 = !metroTicketAppModel11114.h(j20);
                Long l11114 = new Long(j211116);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0 = metroTicketBooking8;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1 = productReceiptData3;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3 = list5;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4 = bookingDetailsUIState4;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5 = priceDetailsUIState;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6 = ticketSupportUIState;
                productSummaryStatusUiData = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$9 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$10 = null;
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.label = 13;
                ProductSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1 productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11116 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                objA = a(productReceiptData3, metroTicketBooking8, map11114, str11111117, l11114, EmptyList.f17557a, z11118, function211115, productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11116);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$11116;
                if (objA == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                priceDetailsUIState4 = priceDetailsUIState;
                obj13 = objA;
                bookingDetailsUIState7 = bookingDetailsUIState4;
                list7 = list5;
                toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                ticketSupportUIState2 = ticketSupportUIState;
                ticketInfoUIState = (TicketInfoUIState) obj13;
                if (productReceiptData3 == null) {
                    break;
                }
                ticketInfoUIState2 = ticketInfoUIState;
                priceDetailsUIState5 = priceDetailsUIState4;
                productSummaryStatusUiData2 = productSummaryStatusUiData;
                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
            case 13:
                TicketSupportUIState ticketSupportUIState20 = (TicketSupportUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                priceDetailsUIState4 = (PriceDetailsUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                BookingDetailsUIState bookingDetailsUIState12 = (BookingDetailsUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                List list25 = (List) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState11 = (ToolBarWithRightComponentUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                productReceiptData3 = (ProductReceiptData) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                metroTicketBooking8 = (ChaloUserBookingType.TicketBooking.MetroTicketBooking) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$2 = productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1;
                toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState11;
                bookingDetailsUIState7 = bookingDetailsUIState12;
                ticketSupportUIState2 = ticketSupportUIState20;
                list7 = list25;
                almostBlackColor = almostBlackColor2;
                chaloTextStyleHelper9 = chaloTextStyleHelper11;
                stringProvider7 = stringProvider9;
                productSummaryStatusUiData = null;
                coroutineSingletons4 = coroutineSingletons6;
                ticketInfoUIState = (TicketInfoUIState) obj13;
                if (productReceiptData3 == null) {
                    break;
                }
                ticketInfoUIState2 = ticketInfoUIState;
                priceDetailsUIState5 = priceDetailsUIState4;
                productSummaryStatusUiData2 = productSummaryStatusUiData;
                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
            case 14:
                chaloTextStyleHelper10 = (ChaloTextStyleHelper) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$8;
                chaloColorToken = (ChaloColorToken) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$7;
                imageUIState = (ImageUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$6;
                ticketInfoUIState3 = (TicketInfoUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$5;
                ticketSupportUIState2 = (TicketSupportUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$4;
                priceDetailsUIState6 = (PriceDetailsUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$3;
                bookingDetailsUIState7 = (BookingDetailsUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$2;
                list7 = (List) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$1;
                toolBarWithRightComponentUIState5 = (ToolBarWithRightComponentUIState) productSummaryUIStateFactory$getMetroTicketBookingSummaryUIState$1.L$0;
                ResultKt.b(obj13);
                almostBlackColor = almostBlackColor2;
                ticketInfoUIState2 = ticketInfoUIState3;
                priceDetailsUIState5 = priceDetailsUIState6;
                productSummaryStatusUiData2 = new ProductSummaryStatusUiData(imageUIState, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper10, (String) obj13, almostBlackColor, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState5, list7, ticketInfoUIState2, bookingDetailsUIState7, productSummaryStatusUiData2, priceDetailsUIState5, null, null, ticketSupportUIState2, 1921);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
